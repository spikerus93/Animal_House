package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;

import java.io.IOException;

public class GetAnimalById extends Command{
    public GetAnimalById(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить данные по ID";
    }

    @Override
    public void execute() throws IOException {
        consoleUI.getInfoById();
    }
}
