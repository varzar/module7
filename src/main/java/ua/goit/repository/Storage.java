package ua.goit.repository;

import ua.goit.model.Shape;

public interface Storage {
    void add(Shape shape);
    void remove(Shape shape);
    Shape remove(int index);
    Shape[] FindAll();
}
