package ru.gb.Animal_House.model.animal.packAnimal;

import java.time.LocalDate;

public class Horse extends PackAnimal{
    public Horse(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.type += "Лошадь";
    }
}
