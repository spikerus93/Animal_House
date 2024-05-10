package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;

public class Remove extends Command{
    public Remove(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Удалить сведения о животном из реестра";
    }

    @Override
    public void execute() {
        consoleUI.remove();
    }
}
