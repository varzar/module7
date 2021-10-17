package ua.goit.controller.command;

import ua.goit.model.Shape;
import ua.goit.repository.Storage;
import ua.goit.view.View;

public class FindAll implements Command{
    private final View view;
    private final Storage storage;
    private final static String COMMAND_NAME = "findAll";

    public FindAll(View view, Storage storage) {
        this.view = view;
        this.storage = storage;
    }

    @Override
    public boolean canProcess(String input) {
        return input.equals(COMMAND_NAME);
    }

    @Override
    public void process() {
        final String arrayEmpty =  "Sorry, no figures";
        Shape[] shapes = storage.FindAll();
        boolean isArrayEmpty = true;
        for (Shape shape: shapes) {
            if (shape != null){
                view.write(shape.toString());
                isArrayEmpty = false;
            }
        }
        if (isArrayEmpty){
            view.write(arrayEmpty);
        }
    }
}
