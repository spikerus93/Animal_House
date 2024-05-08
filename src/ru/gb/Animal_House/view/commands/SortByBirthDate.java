package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;

import java.io.IOException;

public class SortByBirthDate extends Command{
    public SortByBirthDate(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сортировка данных по Дате рождения";
    }

    @Override
    public void execute() throws IOException {
        consoleUI.sortByBirthDate();
    }
}
