package ru.gb.Animal_House.model.animal.homeAnimal;

import java.time.LocalDate;

public class Hamster extends HomeAnimal{
    public Hamster(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.type += "Хомяк";
    }
}
