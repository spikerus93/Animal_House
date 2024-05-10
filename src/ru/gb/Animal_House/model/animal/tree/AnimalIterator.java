package ru.gb.Animal_House.model.animal.tree;

import java.util.Iterator;
import java.util.List;

public class AnimalIterator<E> implements Iterator<E> {
    private int index = 0;

    private List<E> animalList;

    public AnimalIterator(List<E> animalList) {
        this.animalList = animalList;
    }


    @Override
    public boolean hasNext() {
        return index < animalList.size();
    }

    @Override
    public E next() {
        return animalList.get(index++);
    }
}
