package ru.gb.Animal_House.view;

import ru.gb.Animal_House.view.commands.Command;

import java.util.List;

public class MainMenu {

    private List<Command> commandList;

    public MainMenu(ConsoleUI consoleUI) {

    }

    public String menu() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            sb.append(i+1).append(". ").append(commandList.get(i).getDescription()).append("\n");
        }
        return sb.toString();
    }

    public int getSize() {
        return commandList.size();
    }

    public void execute(int choice) {
        Command command = commandList.get(choice-1);
        command.execute();
    }
}
