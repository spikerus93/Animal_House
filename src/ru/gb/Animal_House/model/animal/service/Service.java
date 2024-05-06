package ru.gb.Animal_House.model.animal.service;

import ru.gb.Animal_House.model.animal.Animal;
import ru.gb.Animal_House.model.animal.animalbuilder.AnimalBuilder;
import ru.gb.Animal_House.model.animal.tree.AnimalTree;
import ru.gb.Animal_House.model.animal.writer.Writer;

import java.io.IOException;
import java.time.LocalDate;

public class Service {

    private AnimalTree animalTree;
    private AnimalBuilder builder;
    private Writer writer;

    public Service() {
        animalTree = new AnimalTree();
        builder = new AnimalBuilder();
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void load() throws IOException {
        animalTree = (AnimalTree) writer.restore("Animal_House.out");
    }

    public Animal addAnimal(int type, String name, LocalDate birthDate) {
        Animal animal = builder.build(type, name, birthDate);
        animalTree.add(animal);
        return animal;
    }

    public boolean checkId(int id) {
        Animal animal = (Animal) animalTree.getById(id);
        return animal != null;
    }
}
