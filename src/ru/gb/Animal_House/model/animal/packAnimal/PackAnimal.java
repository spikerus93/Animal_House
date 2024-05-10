package ru.gb.Animal_House.model.animal.packAnimal;

import ru.gb.Animal_House.model.animal.Animal;

import java.time.LocalDate;

public abstract class PackAnimal extends Animal {
    public PackAnimal(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.animalClass = "Вьючное животное, Семейство: ";
    }
}

