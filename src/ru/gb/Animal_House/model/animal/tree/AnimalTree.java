package ru.gb.Animal_House.model.animal.tree;

import ru.gb.Animal_House.model.animal.tree.comparators.AnimalComparatorByBirthDate;
import ru.gb.Animal_House.model.animal.tree.comparators.AnimalComparatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalTree<E extends TreeNode<E>> implements Serializable, Iterable<E> {
    private int memberId = 1;
    private int counter = 0;
    private List<E> animalList;
    public AnimalTree() {
        animalList = new ArrayList<>();
    }

    public void add(E animal) {
        if (!animalList.contains(animal)) {
            animalList.add(animal);
            animal.setId(memberId++);
            counter++;
        }
    }

        public String seeCommands (int memberId){
            StringBuilder sb = new StringBuilder();
            sb.append("id: ");
            sb.append(memberId);
            E animal = getById(memberId);
            if (animal != null) {
                sb.append(" Кличка: ");
                sb.append(animal.getName());
                sb.append(" Тип: ");
                sb.append(animal.getAnimalClass());
                sb.append(" Команды: ");
                sb.append(animal.getCommands() + "\n");
                return sb.toString();
            }
            return "Данные отсутствуют";
        }


        public int getCounter () {
            return counter;
        }

        public void remove (int animalId){
            if (checkId(animalId)) {
                E element = getById(animalId);
                animalList.remove(element);
                counter--;
            }
        }

        private boolean checkId ( int id){
            return id < memberId && id >= 0;
        }

        public E getById ( int id){
            if (checkId(id)) {
                for (E animal : animalList) {
                    if (animal.getId() == id) {
                        return animal;
                    }
                }
            }
            return null;
        }

        public void sortByName () {
            animalList.sort(new AnimalComparatorByName());
        }

        public void sortByBirthDate () {
            animalList.sort(new AnimalComparatorByBirthDate());
        }

        public String getAnimalList () {
            StringBuilder sb = new StringBuilder();
            for (E animal : animalList) {
                sb.append(animal);
            }
            return sb.toString();
        }

        @Override
        public String toString () {
            return getInfo();
        }

        public String getInfo () {
            StringBuilder sb = new StringBuilder();
            sb.append("В питомнике ");
            sb.append(animalList.size());
            sb.append(" животных \n");
            for (E animal : animalList) {
                sb.append(animal);
                sb.append("\n");
            }
            return sb.toString();
        }

        public String getInfoById (int memberId) {
        StringBuilder sb = new StringBuilder("ID - ");
        sb.append(memberId).append("\n").append("\n");
        E animal = getById(memberId);
        if (animal != null) {
            sb.append("Тип: ").append(animal.getAnimalClass() + "\n");
            sb.append("Кличка: ").append(animal.getName() + "\n");
            sb.append("Дата рождения: ").append(animal.getBirthDate() + "\n");
        }
        if (animal.getCommands() != null) {
            sb.append(animal.getCommands() + "\n");
            return sb.toString();
        }
        return "Данных нет.";
        }

        @Override
        public Iterator<E> iterator () {
            return new AnimalIterator<E>(animalList);
        }
    }


