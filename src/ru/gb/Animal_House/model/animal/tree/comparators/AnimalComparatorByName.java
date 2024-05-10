package ru.gb.Animal_House.model.animal.tree.comparators;

import ru.gb.Animal_House.model.animal.tree.TreeNode;

import java.util.Comparator;

public class AnimalComparatorByName<E extends TreeNode> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return (o1.getName().compareTo(o2.getName()));
    }
}
