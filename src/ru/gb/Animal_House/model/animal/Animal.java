package ru.gb.Animal_House.model.animal;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Animal {
    private long id;
    private Animal animal;
    private String name;
    private AnimalClass animalClass;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private List<Animal> animalList;

    public Animal (String name, AnimalClass animalClass, LocalDate birthDate,
                   LocalDate deathDate, Animal mother, Animal father){
        id = -1;
        this.name = name;
        this.animalClass = animalClass;
        this.birthDate = birthDate;
        this. deathDate = deathDate;
        animalList = new ArrayList<>();
    }

    public boolean addAnimal (Animal animal) {
        if (!animal.contains((animal))) {
            animal.add(animal);
            return true;
        }
        return false;
    }

    public void setClass (Animal animal) {
        this. animalClass = animalClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimalList() {
        List<Animal>  listAnimal = new ArrayList<>();
        if (animal.setClass().equals(animalClass.Home)){
            setClass(HomeAnimal);
        } else if (animal.setClass().equals(animalClass.Farm)) {
            setClass(PackAnimal);
        }
        return listAnimal;
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

    public List<Animal> = getAnimalList() {
        return animalList;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public AnimalClass getAnimalClass() {
        return animalClass;
    }
}
