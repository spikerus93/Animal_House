package ru.gb.Animal_House.model.animal.packAnimal;

import java.time.LocalDate;

public class Donkey extends PackAnimal{
    public Donkey(String name, LocalDate birthDate, LocalDate deathDate) {
        super(name, birthDate, deathDate);
        this.type = "Осёл";
    }
}
