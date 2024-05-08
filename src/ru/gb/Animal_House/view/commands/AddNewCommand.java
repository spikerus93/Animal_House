package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;

import java.io.IOException;

public class AddNewCommand extends Command{
    public AddNewCommand(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Обучение животного новым командам";
    }

    @Override
    public void execute() throws IOException {
        consoleUI.addCommand();
    }
}
