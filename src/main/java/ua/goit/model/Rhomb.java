package ua.goit.model;

import java.util.Objects;

public class Rhomb extends Shape{
    private double side;
    private double radiusInscribedCircle;

    public Rhomb(double side, double radiusInscribedCircle) {
        super("rhomb");
        this.side = side;
        this.radiusInscribedCircle = radiusInscribedCircle;
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
        Rhomb rhomb = (Rhomb) o;
        return Double.compare(rhomb.side, side) == 0 && Double.compare(rhomb.radiusInscribedCircle, radiusInscribedCircle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side, radiusInscribedCircle);
    }

    @Override
    public String toString() {
        return super.toString() + ",  side=" + side + ", radius inscribed circle = " + radiusInscribedCircle;
    }
}
