package ru.gb.Animal_House.view;

import ru.gb.Animal_House.model.animal.writer.Writer;
import ru.gb.Animal_House.presenter.Presenter;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View{


    private final Presenter presenter;

    private final Scanner scanner;

    private  boolean work;

    private final MainMenu menu;

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

    public void load() {
        try {
            presenter.load();
            download();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    private void download() {
        System.out.println("Данные успешно загружены. \n");
    }

    private void error() {
        System.out.println("Ошибка. Данные не сохранены! \n");
    }

    private void success() {
        System.out.println("Данные сохранены. \n");
    }

    public void counter() {
        System.out.println("В питомнике: " + presenter.counter() + " животных \n");
    }

    private void hello() {
        System.out.println("Добро Пожаловать!!! \n");
    }

    private void choice() throws RuntimeException{
        String value = scanner.nextLine();
        if (checkMenu(value)) {
            int num = Integer.parseInt(value);
            try {
                menu.execute(num);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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
        System.out.println("Вы ввели неверное значение. \n");
        return false;
    }

    public void finish() {
        System.out.println("\n Всего Вам доброго!!! \n");
        scanner.close();
        work = false;
    }

    private void setMenu() {
        System.out.println("Выберите действие: \n");
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
                System.out.println("Вы ввели неверное значение. \n Введите цифру от 1 до 9 \n");
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
                System.out.println("Вы ввели неверное значение. \n Выберите цифры от 1 до 6 \n");
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
                System.out.println("Заданный id не найден. \n Введите новое значение. \n");
            }
        }
        return id;
    }

    public void getInfoById() {
        System.out.println("Введите ID: ");
        int id = checkId();
        presenter.getInfoById(id);
    }

    public void getInfo() {
        presenter.getInfo();
    }

    public LocalDate setBirthDate () {
        System.out.println("Введите год рождения: ");
        int year = checkInt();
        System.out.println("Введите месяц рождения: ");
        int month = checkInt();
        System.out.println("Введите день рождения: ");
        int day = checkInt();
        if (!presenter.setBirthDate(year, month, day)) {
            System.out.println("Неверный формат даты! \n");
            error();
        } else {
            success();
        }
        return LocalDate.of(year, month, day);
    }

    public void addAnimal() {
        System.out.println("Выберите тип животного: \n 1 - Собака \n 2 - Кошка" +
                " \n 3 - Хомяк \n 4 - Лошадь \n 5 - Верблюд \n 6 - Осел");
        int animalClass = checkAnimalClass();
        System.out.println("Введите кличку: ");
        String name = scanner.nextLine();
        System.out.println("Введите дату рождения: \n");
        LocalDate birthDate = setBirthDate();
        try {
            presenter.addAnimal(animalClass, name, birthDate);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addCommand() {
        System.out.println("Введите ID: ");
        int id = checkId();
        System.out.println("Добавьте новую команду: ");
        String command = scanner.nextLine();
        presenter.addCommand(id, command);
        success();
    }

    public void seeCommands() {
        System.out.println("Введите id: ");
        int id = checkId();
        System.out.println("Список команд: \n");
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
        hello();
        while (work) {
            setMenu();
            choice();
        }
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}
