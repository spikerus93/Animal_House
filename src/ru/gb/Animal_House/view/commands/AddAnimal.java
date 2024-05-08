package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;

public class AddAnimal extends Command{
    public AddAnimal(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить новое животное";
    }

    @Override
    public void execute() {
        consoleUI.addAnimal
    }
}
