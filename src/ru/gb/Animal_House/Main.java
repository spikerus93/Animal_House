package ru.gb.Animal_House;

import ru.gb.Animal_House.model.animal.writer.FileHandler;
import ru.gb.Animal_House.view.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        ConsoleUI animalHouse = new ConsoleUI();
        animalHouse.setWriter(new FileHandler());
        animalHouse.start();
    }
}
