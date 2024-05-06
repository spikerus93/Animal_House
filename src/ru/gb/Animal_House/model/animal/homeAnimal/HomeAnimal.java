package ru.gb.Animal_House.model.animal.homeAnimal;

import ru.gb.Animal_House.model.animal.Animal;

import java.time.LocalDate;

public class HomeAnimal extends Animal {

    public HomeAnimal(String name, LocalDate birthDate, LocalDate deathDate) {
        super(name, birthDate, deathDate);
        this.type = "Домашнее животное";
    }
}
