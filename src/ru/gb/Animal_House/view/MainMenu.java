package ru.gb.Animal_House.view;

import ru.gb.Animal_House.view.commands.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainMenu {

    private List<Command> commandList;

    public MainMenu(ConsoleUI consoleUI) {
        commandList = new ArrayList<>();
        commandList.add(new AddAnimal(consoleUI));
        commandList.add(new AddNewCommand(consoleUI));
        commandList.add(new ListCommands(consoleUI));
        commandList.add(new Counter(consoleUI));
        commandList.add(new GetAnimalById(consoleUI));
        commandList.add(new AnimalTreeInfo(consoleUI));
        commandList.add(new SortByName(consoleUI));
        commandList.add(new SortByBirthDate(consoleUI));
        commandList.add(new Save(consoleUI));
        commandList.add(new Load(consoleUI));
        commandList.add(new Remove(consoleUI));
        commandList.add(new Finish(consoleUI));


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

    public void execute(int choice) throws IOException {
        Command command = commandList.get(choice-1);
        command.execute();
    }
}
