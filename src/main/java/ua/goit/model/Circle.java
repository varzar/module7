package ua.goit.model;

import java.util.Objects;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return  super.toString() + ", radius = " + radius;
    }
}
