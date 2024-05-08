package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;

public abstract class Command {

    String description;

    ConsoleUI consoleUI;

    public Command(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();

}
