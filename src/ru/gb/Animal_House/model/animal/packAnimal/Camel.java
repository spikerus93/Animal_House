package ru.gb.Animal_House.model.animal.packAnimal;

import java.time.LocalDate;

public class Camel extends PackAnimal{
    public Camel(String name, LocalDate birthDate, LocalDate deathDate) {
        super(name, birthDate, deathDate);
        this.type = "Верблюд";
    }
}
