package ru.gb.Animal_House.model.animal.tree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface TreeNode<E> extends Serializable {
    void setId(int id);
    long getId();
    String getName();
    LocalDate getBirthDate();
    String getCommands();
    String getAnimalClass();
}
