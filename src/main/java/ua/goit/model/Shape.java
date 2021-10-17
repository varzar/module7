package ua.goit.model;

import java.util.Objects;

public abstract class Shape {
    protected String name;
    public abstract void printName();

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name = " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(name, shape.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
