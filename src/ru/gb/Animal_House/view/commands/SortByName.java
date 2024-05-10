package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;

import java.io.IOException;

public class SortByName extends Command{
    public SortByName(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сортировка данных по Имени";
    }

    @Override
    public void execute() throws IOException {
        consoleUI.sortByName();
    }
}
