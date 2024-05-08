package ru.gb.Animal_House.view;

import ru.gb.Animal_House.model.animal.writer.Writer;
import ru.gb.Animal_House.presenter.Presenter;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Locale;
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

    public void setWriter(Writer writer) {
        presenter.setWriter(writer);
    }

    public void save() {
        if (presenter.save()) {
            success();
        } else {
            error();
        }
    }

    public void load() throws IOException {
        try {
            presenter.load();
            download();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    private void download() {
        System.out.println("Данные успешно загружены.");
    }

    private void error() {
        System.out.println("Ошибка. Данные не сохранены!");
    }

    private void success() {
        System.out.println("Данные сохранены.");
    }

    public void counter() {
        System.out.println("В питомники:" + Integer.toString(presenter.counter()));
    }

    private void hello() {
        System.out.println("Добро Пожаловать!!!");
    }

    private void choice() {
        String value = scanner.nextLine();
        if (checkMenu(value)) {
            int num = Integer.parseInt(value);
            menu.execute(num);

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

    public void finish() {
        System.out.println("Всего Вам доброго!!!");
    }

    private void printmenu() {
        System.out.println("Выберите действие: ");
        System.out.println(menu.menu());
    }

    private int checkInt() {
        int value = 0;
        boolean i = true;
        while (i) {
            String text = scanner.nextLine();
            if (text.matches("[0-9]+")) {
                value = Integer.parseInt(text);
                i = false;
            } else {
                System.out.println("Вы ввели неверное значение. \n Введите цифру от 1 до 9");
            }
        }
        return value;
    }

    private int checkAnimalClass() {
        int value = 0;
        boolean i = true;
        while (i) {
            String text = scanner.nextLine();
            if (text.matches( "[0-6]")) {
                value = Integer.parseInt(text);
                i = false;
            } else {
                System.out.println("Вы ввели неверное значение. \n Выберите цифры от 1 до 6");
            }
        }
        return value;
    }

    private int checkId() {
        boolean i = true;
        int id = 0;
        while (i) {
            id = checkInt();
            if (presenter.checkId(id)) {
                i = false;
                return id;
            } else {
                System.out.println("Заданный id не найден. \n Введите новое значение.");
            }
        }
        return id;
    }

    public void addAnimal() {
        System.out.println("Выберите тип животного: \n 1 - Собака \n 2 - Кошка" +
                " \n 3 - Хомяк \n 4 - Лошадь \5 - Верблюд \6 - Осел");
        int animalClass = checkAnimalClass();
        System.out.println("Введите кличку: ");
        String name = scanner.nextLine();
        System.out.println("Введите год рождения: ");
        int year = checkInt();
        System.out.println("Введите месяц рождения: ");
        int month = checkInt();
        System.out.println("Введите день рождения: ");
        int day = checkInt();
        LocalDate birthDate = null;
        if (presenter.dateValid(year, month, day)) {
            birthDate = presenter.setBirthDate(year, month, day);
        } else {
            System.out.println("Неверный формат даты.");
            error();
        }
        presenter.addAnimal(animalClass, name, birthDate);
    }

    public void addCommand() {
        System.out.println("Введите ID: ");
        int id = checkId();
        System.out.println("Добавьте новую команду: ");
        String command = scanner.nextLine();
        presenter.addCommand(id, command);
    }

    public void seeCommands() {
        System.out.println("Введите id: ");
        int id = checkId();
        presenter.seeCommands(id);
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void sortByBirthDate() {
        presenter.sortByBirthDate();
    }

    public void remove() {
        System.out.println("Введите ID: ");
        int id = checkId();
        if (presenter.remove(id)) {
            success();
        } else {
            error();
        }
    }

    @Override
    public void start() {
    }

    @Override
    public void printAnswer(String answer) {

    }
}
