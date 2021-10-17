package ua.goit.controller.command;

import ua.goit.model.Rectangle;
import ua.goit.model.RightTriangle;
import ua.goit.repository.Storage;
import ua.goit.view.View;

public class AddRightTriangle implements Command{
    private final View view;
    private final Storage storage;
    private final static String COMMAND_NAME = "addRightTriangle";

    public AddRightTriangle(View view, Storage storage) {
        this.view = view;
        this.storage = storage;
    }

    @Override
    public boolean canProcess(String input) {
        return input.equals(COMMAND_NAME);
    }

    @Override
    public void process() {
        final String enterFirstKatet = "Enter the length of the smaller side of the right triangle: ";
        final String enterSecondKatet = "Enter the length of the bigger side of the right triangle: ";
        final String successMessage = " created";
        double firstKatet = AddDoubleValue.addValue(view, enterFirstKatet);
        double secondKatet = AddDoubleValue.addValue(view, enterSecondKatet);
        RightTriangle rightTriangle = new RightTriangle(firstKatet, secondKatet);
        storage.add(rightTriangle);
        view.write(rightTriangle + successMessage);
    }
}
