package ru.gb.Animal_House.model.animal;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import static ru.gb.Animal_House.model.animal.AnimalClass.*;

public class Animal {
    private Animal animal;
    private long id;
    private String name;
    private AnimalClass animalClass;
    private Animal homeAnimal;
    private Animal packAnimal;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private List<Animal> animalList;
    private List<String> commands;

    public Animal(){};

    public void setAnimalClass(AnimalClass animalClass) {
        this.animalClass = animalClass;
    }

    public Animal (AnimalClass animalClass, String name, LocalDate birthDate, LocalDate deathDate, Animal homeAnimal, Animal packAnimal){
        id = -1;
        this.animal = new Animal();
        this.animalClass = animalClass;
        this.name = name;
        this.birthDate = birthDate;
        this. deathDate = deathDate;
        this.homeAnimal = homeAnimal;
        this.packAnimal = packAnimal;
        animalList = new ArrayList<>();
    }

    public boolean addAnimal (Animal animal) {
        if (animal.getAnimalClass().equals(AnimalClass.Home)) {
            setHomeAnimal(animal);
        } else if (animal.getAnimalClass().equals(AnimalClass.Farm)) {
            setPackAnimal(animal);
        }
        return true;
    }

    public void setHomeAnimal(Animal homeAnimal) {
        this.homeAnimal = homeAnimal;
    }

    public void setPackAnimal(Animal packAnimal) {
        this.packAnimal = packAnimal;
    }

    public AnimalClass getAnimalClass() {
        return animalClass;
    }

    public boolean setClass (AnimalClass animalClass) {
        if (animal.getAnimalClass().equals(Home)) {
            setHomeAnimal(animal);
        } else if (animal.getAnimalClass().equals(Farm)) {
            setPackAnimal(animal);
        }
        return true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimalList() {
        List<Animal>  AnimalList = new ArrayList<>();
        if (animal.setClass(Home)){
            setHomeAnimal(homeAnimal);
        } else if (animal.setClass(Home)) {
            setPackAnimal(packAnimal);
        }
        return AnimalList;
    }

    public String getCommands() {
        if (!(this.commands).isEmpty()) {
            StringBuilder sb = new StringBuilder("Команды: ");
            sb.append(this.commands);
            return sb.toString();
        }
        return null;
    }

    public int getAge() {
        if (deathDate == null){
            return getPeriod(birthDate, LocalDate.now());
        } else {
            return getPeriod(birthDate, deathDate);
        }
    }

    private int getPeriod (LocalDate birthDate, LocalDate deathDate) {
        Period diff = Period.between(birthDate, deathDate);
        return diff.getYears();
    }

    public String getName() {
        return name;
    }

    public void setId (long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }


    @Override public String toString() {
        return getInfo();
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append(" кличка: ");
        sb.append(name);
        sb.append(" дата рождения: ");
        sb.append(getBirthDate());
        sb.append(" класс: ");
        sb.append(addAnimal(animal));
        sb.append(" возраст: ");
        sb.append(getAge());
        sb.append(".");
        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Animal)){
            return false;
        }
        Animal animal = (Animal) object;
        return animal.getId() == getId();
    }
}
