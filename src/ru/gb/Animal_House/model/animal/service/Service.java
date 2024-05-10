package ru.gb.Animal_House.model.animal.service;

import ru.gb.Animal_House.model.animal.Animal;
import ru.gb.Animal_House.model.animal.animalbuilder.AnimalBuilder;
import ru.gb.Animal_House.model.animal.tree.AnimalTree;
import ru.gb.Animal_House.model.animal.writer.Writer;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Service {

    private AnimalTree<Animal> animalTree;
    private final AnimalBuilder builder;
    private Writer writer;

    public Service() {
        animalTree = new AnimalTree<>();

        builder = new AnimalBuilder();
    }

    public boolean setBirthDate (int year, int month, int day) {
        Animal animal = new Animal();
        animal.setBirthDate(checkDate(year, month, day));
        return animal.getBirthDate() != null;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public boolean save() {
        return writer.write(animalTree, "AnimalHouse.txt");
    }

    public void load() {
        animalTree = (AnimalTree<Animal>) writer.restore("AnimalHouse.txt");
    }

    public int counter() {
        return animalTree.getCounter();
    }

    public boolean dateValid(int year, int month, int day) {
        try {
            LocalDate date = LocalDate.of(year, month, day);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }

    public LocalDate checkDate(int year, int month, int day) {
        LocalDate date = null;
        if (dateValid(year, month, day)) {
            date = LocalDate.of(year, month, day);
        }
        return date;
    }

    public Animal addAnimal(int animalClass, String name, LocalDate birthDate) {
        Animal animal = builder.build(animalClass, name, birthDate);
        animalTree.add(animal);
        return animal;
    }

    public void addCommand(int id, String command) {
        Animal animal = animalTree.getById(id);
        animal.setCommands(command);
        animalTree.getInfo();
    }

    public String seeCommands(int id) {
        return animalTree.seeCommands(id);
    }

    public boolean checkId(int id) {
        Animal animal = animalTree.getById(id);
        return animal != null;
    }

    public void sortByName() {
        animalTree.sortByName();
        getInfo();
    }

    public void sortByBirthDate() {
        animalTree.sortByBirthDate();
        getInfo();
    }

    public String getAnimalList() {
        return animalTree.getAnimalList();
    }

    public boolean remove(int id) {
        Animal animal = animalTree.getById(id);
        if (animal != null) {
            animalTree.remove(id);
            return  true;
        }
        return false;
    }

    public String getInfo() {
        return animalTree.getInfo();
    }

    public String getInfoById(int id) {
        return animalTree.getInfoById(id);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
