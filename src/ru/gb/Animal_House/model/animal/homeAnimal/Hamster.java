package ru.gb.Animal_House.model.animal.homeAnimal;

import java.time.LocalDate;

public class Hamster extends HomeAnimal{
    public Hamster(String name, LocalDate birthDate, LocalDate deathDate) {
        super(name, birthDate, deathDate);
        this.type = "Хомяк";
    }
}
