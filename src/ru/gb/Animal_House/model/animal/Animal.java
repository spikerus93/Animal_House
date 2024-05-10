package ru.gb.Animal_House.model.animal;

import ru.gb.Animal_House.model.animal.tree.TreeNode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Animal implements TreeNode<Animal> {
    private int id;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setCommands(String command) {
        this.commands.add(command);
    }

    public String getCommands() {
        if (!(this.commands).isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.commands);
            return sb.toString();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setId (int id) {
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

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
         return "ID: " + id + ", тип: " + animalClass + ", кличка: "
                + name + ", дата рождения: " + birthDate + "\n";
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
