package ru.gb.Animal_House.model.animal;

import ru.gb.Animal_House.model.animal.tree.TreeNode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Animal implements TreeNode {
    private Animal animal;
    private long id;
    private String name;
    public String animalClass;
    private LocalDate birthDate;
    private List<String> commands;

    public Animal(){};

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    @Override
    public String getAnimalClass() {
        return animalClass;
    }

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.animalClass = "Животное";
        this.commands = new ArrayList<>();
    }

    public Animal (String animalClass, String name, LocalDate birthDate){
        id = -1;
        this.animal = new Animal();
        this.animalClass = animalClass;
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommands() {
        if (!(this.commands).isEmpty()) {
            StringBuilder sb = new StringBuilder("Команды: ");
            sb.append(this.commands);
            return sb.toString();
        }
        return null;
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

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override public String toString() {
        return getInfo();
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append(" Тип: ");
        sb.append(animalClass);
        sb.append(" кличка: ");
        sb.append(name);
        sb.append(" дата рождения: ");
        sb.append(getBirthDate());
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
