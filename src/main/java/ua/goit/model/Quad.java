package ua.goit.model;

import java.util.Objects;

public class Quad extends Shape{
    private double side;

    public Quad(double side) {
        super("quad");
        this.side = side;
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
        Quad quad = (Quad) o;
        return Double.compare(quad.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }

    @Override
    public String toString() {
        return super.toString() + ", side = " + side;
    }
}
