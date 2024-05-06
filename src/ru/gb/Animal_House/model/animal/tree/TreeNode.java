package ru.gb.Animal_House.model.animal.tree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface TreeNode<T> extends Serializable {
    void setId(long id);
    long getId();
    T homeAnimal();
    T packAnimal();
    String getName();
    LocalDate getBirthDate();
    LocalDate getDeathDate();
    List<T> getAnimalList();
}
