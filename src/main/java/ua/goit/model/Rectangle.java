package ua.goit.model;

import java.util.Objects;

public class Rectangle extends Shape{
    private double sidA;
    private double sideB;

    public Rectangle(double sidA, double sideB) {
        super("rectangle");
        this.sidA = sidA;
        this.sideB = sideB;
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
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sidA, sidA) == 0 && Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sidA, sideB);
    }

    @Override
    public String toString() {
        return super.toString() + ", first side = " + sidA + ", second side = " + sideB;
    }
}
