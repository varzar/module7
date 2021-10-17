package ua.goit.model;

import java.util.Objects;

public class Oval extends Shape{
    private double radiusMinor;
    private double radiusMajor;

    public Oval(double radiusMinor, double radiusMajor) {
        super("oval");
        this.radiusMinor = radiusMinor;
        this.radiusMajor = radiusMajor;
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
        Oval oval = (Oval) o;
        return Double.compare(oval.radiusMinor, radiusMinor) == 0 && Double.compare(oval.radiusMajor, radiusMajor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radiusMinor, radiusMajor);
    }

    @Override
    public String toString() {
        return  super.toString() + ", smaller radius = " + radiusMinor + ", bigger radius = " + radiusMajor;
    }
}
