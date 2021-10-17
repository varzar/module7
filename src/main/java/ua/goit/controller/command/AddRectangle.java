package ua.goit.controller.command;

import ua.goit.model.Rectangle;
import ua.goit.repository.Storage;
import ua.goit.view.View;

public class AddRectangle implements Command{
    private final View view;
    private final Storage storage;
    private final static String COMMAND_NAME = "addRectangle";

    public AddRectangle(View view, Storage storage) {
        this.view = view;
        this.storage = storage;
    }

    @Override
    public boolean canProcess(String input) {
        return input.equals(COMMAND_NAME);
    }

    @Override
    public void process() {
        final String enterFirstSide = "Enter the length of the first side of the rectangle: ";
        final String enterSecondSide = "Enter the length of the second side of the rectangle: ";
        final String successMessage = " created";
        double firstSide = AddDoubleValue.addValue(view, enterFirstSide);
        double secondSide = AddDoubleValue.addValue(view, enterSecondSide);
        Rectangle rectangle = new Rectangle(firstSide, secondSide);
        storage.add(rectangle);
        view.write(rectangle + successMessage);
    }
}
