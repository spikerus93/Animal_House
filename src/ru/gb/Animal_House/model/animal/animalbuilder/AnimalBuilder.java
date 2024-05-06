package ru.gb.Animal_House.model.animal.animalbuilder;

import ru.gb.Animal_House.model.animal.Animal;
import ru.gb.Animal_House.model.animal.homeAnimal.Cat;
import ru.gb.Animal_House.model.animal.homeAnimal.Dog;
import ru.gb.Animal_House.model.animal.homeAnimal.Hamster;
import ru.gb.Animal_House.model.animal.packAnimal.Camel;
import ru.gb.Animal_House.model.animal.packAnimal.Donkey;
import ru.gb.Animal_House.model.animal.packAnimal.Horse;

import java.time.LocalDate;

public class Animalbuilder {

    public Animal builder(int type, String name, LocalDate birthDate) {
        switch (type) {
            case 1 -> {
                return new Dog(name, birthDate);
            }
            case 2 -> {
                return new Cat(name, birthDate);
            }
            case 3 -> {
                return new Hamster(name, birthDate);
            }
            case 4 -> {
                return new Horse(name, birthDate);
            }
            case 5 -> {
                return new Camel(name, birthDate);
            }
            case 6 -> {
                return new Donkey(name, birthDate);
            }
        }
        return null;
    }
}