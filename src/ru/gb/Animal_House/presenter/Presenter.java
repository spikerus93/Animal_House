package ru.gb.Animal_House.presenter;


import ru.gb.Animal_House.model.animal.service.Service;
import ru.gb.Animal_House.model.animal.writer.Writer;
import ru.gb.Animal_House.view.View;

import java.io.IOException;
import java.time.LocalDate;

public class Presenter {

    private View view;

    private Service service;

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

    public void load() throws IOException {
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

    public LocalDate setBirthDate(int year, int month, int day) {
        if (dateValid(year, month, day)) {
            return service.checkDate(year, month, day);
        }
        return null;
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

    public boolean remove(int id) {
        return service.remove(id);
    }
}
