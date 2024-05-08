package ru.gb.Animal_House.model.animal.packAnimal;

import java.time.LocalDate;

public class Camel extends PackAnimal{
    public Camel(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.animalClass += "Верблюд";
    }
}
