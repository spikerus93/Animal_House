package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;

import java.io.IOException;

public class AnimalTreeInfo extends Command{
    public AnimalTreeInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Общая информация по Питомнику";
    }

    @Override
    public void execute() throws IOException {
        consoleUI.getInfo();
    }
}
