package ru.gb.Animal_House.model.animal.tree.comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalTree {
    private long memberId;
    private List<E> animalList;
    public AnimalTree() {
        this(new ArrayList<>());
    }
    public AnimalTree(List<E> animalList) {
        this.animalList = animalList;
    }

    public boolean add(E animal) {
        if (animal == null) {
            return false;
        }
        if (!animalList.contains(animal)) {
            animalList.add(animal);
            animal.setId(memberId++);
            return true;
        }
        return false;
    }

    public List<E> getByName(String name) {
        List<E> res = new ArrayList<>();
        for (E animal: animalList) {
            if (animal.getName()).equals(name)) {
                res.add(animal);
            }
        }
        return res;
    }

    public boolean remove(long animalId){
        if (checkId(animalId)) {
            E element = getById(animalId);
            return animalList.remove(element);
        }
        return false;
    }

    private boolean checkId(long id) {
        return id < memberId && id >= 0;
    }

    public E getById(long id) {
        if (checkId(id)) {
            for (E animal: animalList) {
                if (animal.getId() == id) {
                    return animal;
                }
            }
        }
        return null;
    }

    public void sortByName() {
        animalList.sort(new AnimalComparatorByName());
    }

    public void sortByBirthDate() {
        animalList.sort(new AnimalComparatorByBirthDate());
    }
}
