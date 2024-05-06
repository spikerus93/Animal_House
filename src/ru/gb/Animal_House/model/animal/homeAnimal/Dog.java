package ru.gb.Animal_House.model.animal.homeAnimal;

import java.time.LocalDate;

public class Dog extends HomeAnimal{
    public Dog(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.type += "Собака";
    }
}
