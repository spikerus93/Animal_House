package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;

import java.io.IOException;

public class Load extends Command{
    public Load(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Загрузить данные";
    }

    @Override
    public void execute() throws IOException {
        consoleUI.load();
    }
}
