package ru.gb.Animal_House.model.animal.tree;

import ru.gb.Animal_House.model.animal.tree.comparators.AnimalComparatorByBirthDate;
import ru.gb.Animal_House.model.animal.tree.comparators.AnimalComparatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalTree<E extends TreeNode> implements Serializable, Iterable<E> {
    private long memberId = 1;
    private int counter = 0;
    private List<E> animalList;
    public AnimalTree() {
        animalList = new ArrayList<>();
    }

    public AnimalTree(List<E> animalList) {
        this.animalList = animalList;
    }

    public void add(E animal) {
            animal.setId(memberId++);
            animalList.add(animal);
            counter++;
    }

    public int getCounter() {
        return counter;
    }

    public List<E> getByName(String name) {
        List<E> res = new ArrayList<>();
        for (E animal: animalList) {
            if (animal.getName().equals(name)) {
                res.add(animal);
            }
        }
        return res;
    }

    public boolean remove(long animalId){
        if (checkId(animalId)) {
            E element = getById(animalId);
            counter--;
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

    public String getAnimalList() {
        StringBuilder sb = new StringBuilder();
        for (E animal: animalList) {
            sb.append(animal);
        }
        return sb.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new AnimalIterator<>(animalList);
    }
}
