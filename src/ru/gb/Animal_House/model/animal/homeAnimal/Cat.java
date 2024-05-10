package ru.gb.Animal_House.model.animal.homeAnimal;

import java.time.LocalDate;

public class Cat extends HomeAnimal {
    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.animalClass += "Кошка";
    }
}
