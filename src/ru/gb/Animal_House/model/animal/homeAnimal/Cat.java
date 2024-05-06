package ru.gb.Animal_House.model.animal.homeAnimal;

import java.time.LocalDate;

public class Cat extends HomeAnimal {
    public Cat(String name, LocalDate birthDate, LocalDate deathDate) {
        super(name, birthDate, deathDate);
        this.type = "Кошка";
    }
}
