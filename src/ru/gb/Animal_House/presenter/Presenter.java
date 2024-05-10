package ru.gb.Animal_House.presenter;


import ru.gb.Animal_House.model.animal.Animal;
import ru.gb.Animal_House.model.animal.service.Service;
import ru.gb.Animal_House.model.animal.writer.Writer;
import ru.gb.Animal_House.view.View;

import java.time.LocalDate;

public class Presenter {

    private final View view;

    private final Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public int counter() {
        return service.counter();
    }

    public void setWriter(Writer writer) {
        service.setWriter(writer);
    }

    public void load() {
        service.load();
    }

    public boolean save() {
        return service.save();
    }

    public void addAnimal (int animalClass, String name, LocalDate birthDate) {
        view.printAnswer(service.addAnimal(animalClass, name, birthDate).toString());
    }

    public boolean dateValid(int year, int month, int day) {
        return service.dateValid(year, month, day);
    }

    public boolean setBirthDate(int year, int month, int day) {
        if (dateValid(year, month, day)) {
            service.setBirthDate(year, month, day);
            getInfo();
            return true;
        }
        return false;
    }

    public boolean checkId(int id) {
        return service.checkId(id);
    }

    public void addCommand(int id, String command) {
        service.addCommand(id, command);
    }

    public void seeCommands(int id) {
        view.printAnswer(service.seeCommands(id));
    }

    public void sortByName() {
        service.sortByName();
        view.printAnswer(service.getAnimalList());
    }

    public void sortByBirthDate() {
        service.sortByBirthDate();
        view.printAnswer(service.getAnimalList());
    }

    public void getInfo() {
        view.printAnswer(service.getInfo());
    }

    public void getInfoById(int id) {
        view.printAnswer(service.getInfoById(id));
    }

    public boolean remove(int id) {
        return service.remove(id);
    }
}
