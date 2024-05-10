package ru.gb.Animal_House.model.animal.tree.comparators;

import ru.gb.Animal_House.model.animal.tree.TreeNode;

import java.util.Comparator;

public class AnimalComparatorByBirthDate<E extends TreeNode> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return (o1.getBirthDate().compareTo(o2.getBirthDate()));
    }
}
