package ua.goit.controller.command;

import ua.goit.model.Triangle;
import ua.goit.repository.Storage;
import ua.goit.view.View;

public class AddTriangle implements Command{
    private final View view;
    private final Storage storage;
    private final static String COMMAND_NAME = "addTriangle";

    public AddTriangle(View view, Storage storage) {
        this.view = view;
        this.storage = storage;
    }

    @Override
    public boolean canProcess(String input) {
        return input.equals(COMMAND_NAME);
    }

    @Override
    public void process() {
        final String enterFirstSide = "Enter the length of the first side of the right triangle: ";
        final String enterSecondSide = "Enter the length of the second side of the right triangle: ";
        final String enterThirdSide = "Enter the length of the third side of the right triangle: ";
        final String successMessage = " created";
        double firstSide = AddDoubleValue.addValue(view, enterFirstSide);
        double secondSide = AddDoubleValue.addValue(view, enterSecondSide);
        double thirdSide = AddDoubleValue.addValue(view, enterThirdSide);
        Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
        storage.add(triangle);
        view.write(triangle + successMessage);
    }
}
