package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;



public class Counter extends Command{
    public Counter(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Счетчик кол-ва животных в Питомнике";
    }

    @Override
    public void execute() {
        consoleUI.counter();
    }
}
