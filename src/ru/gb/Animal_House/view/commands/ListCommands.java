package ru.gb.Animal_House.view.commands;

import ru.gb.Animal_House.view.ConsoleUI;

public class ListCommands extends Command{
    public ListCommands(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Смотреть Список команд по ID";
    }

    @Override
    public void execute() {
        consoleUI.seeCommands();
    }
}
