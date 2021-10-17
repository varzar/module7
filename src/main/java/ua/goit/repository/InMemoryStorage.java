package ua.goit.repository;

import ua.goit.model.Shape;

import java.util.Arrays;

public class InMemoryStorage implements Storage{
    private Shape[] shapes;
    private final static int DEFAULT_SIZE_OF_ARRAY = 24;
    private final static double LOAD_FACTOR = 1.75d;
    private int cursorIndex = 0;

    public InMemoryStorage() {
        this.shapes = new Shape[DEFAULT_SIZE_OF_ARRAY];
    }

    public InMemoryStorage(int size){
        this.shapes = new Shape[size];
    }

    @Override
    public void add(Shape shape) {
        if(shapes.length <= cursorIndex ){
            int newSize = (int) (shapes.length * LOAD_FACTOR);
            shapes = Arrays.copyOf(shapes, newSize);
        }
        shapes[cursorIndex] = shape;
        cursorIndex++;
    }

    @Override
    public void remove(Shape shape) {
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i].equals(shape)){
                shapes[i] = null;
            }
        }
    }

    @Override
    public Shape remove(int index) {
        if(index >= shapes.length || index < 0){
            return null;
        }
        Shape shape = shapes[index];
        shapes[index] = null;
        return shape;
    }

    @Override
    public Shape[] FindAll() {
        return Arrays.copyOf(shapes, shapes.length);
    }
}
