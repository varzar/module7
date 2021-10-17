package ua.goit.model;

import java.util.Objects;

public class RightTriangle extends Shape{
    private double sideA;
    private double sideB;

    public RightTriangle(double sideA, double sideB) {
        super("right triangle");
        this.sideA = sideA;
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
        RightTriangle that = (RightTriangle) o;
        return Double.compare(that.sideA, sideA) == 0 && Double.compare(that.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sideA, sideB);
    }

    @Override
    public String toString() {
        return super.toString() + ", smaller side = " + sideA + ", bigger side = " + sideB;
    }
}
