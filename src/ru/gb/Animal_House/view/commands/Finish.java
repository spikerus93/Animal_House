package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;

import java.io.IOException;

public class Finish extends Command{
    public Finish(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Завершить работу.";
    }

    @Override
    public void execute() throws IOException {
        consoleUI.finish();
    }
}
