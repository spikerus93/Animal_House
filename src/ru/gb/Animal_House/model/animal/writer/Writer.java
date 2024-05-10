package ru.gb.Animal_House.model.animal.writer;

import java.io.Serializable;

public interface Writer {
    boolean write (Serializable serializable, String filePath);

    Object restore (String filePath);
}
