package ru.gb.Animal_House.model.animal.tree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface TreeNode extends Serializable {
    void setId(long id);
    long getId();
    String getName();
    LocalDate getBirthDate();
    LocalDate getDeathDate();
    String getCommands();
    String getAnimalClass();
}
