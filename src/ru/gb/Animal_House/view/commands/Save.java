package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;

public class Save extends Command{
    public Save(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сохранить данные.";
    }

    @Override
    public void execute() {
        consoleUI.save();
    }
}
