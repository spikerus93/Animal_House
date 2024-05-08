package ru.gb.Animal_House.view;

import ru.gb.Animal_House.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{


    private Presenter presenter;

    private Scanner scanner;

    private  boolean work;

    private MainMenu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }

    private void hello() {
        System.out.println("Добро Пожаловать!!!");
    }

    private void choice() {
        String value = scanner.nextLine();
        if (checkMenu(value)) {
            int num = Integer.parseInt(value);

        }
    }

    private boolean checkMenu(String value) {
        try {
            if (Integer.parseInt(value) > 0 && Integer.parseInt(value) <= menu.getSize()) {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Вы ввели неверное значение.");
        return false;
    }

    @Override
    public void start() {
    }

    @Override
    public void printAnswer(String answer) {

    }
}
