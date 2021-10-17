package ua.goit.controller.command;

import ua.goit.model.Quad;
import ua.goit.repository.Storage;
import ua.goit.view.View;

public class AddQuad implements Command{
    private final View view;
    private final Storage storage;
    private final static String COMMAND_NAME = "addQuad";

    public AddQuad(View view, Storage storage) {
        this.view = view;
        this.storage = storage;
    }

    @Override
    public boolean canProcess(String input) {
        return input.equals(COMMAND_NAME);
    }

    @Override
    public void process() {
        final String enterSide = "Enter the length of the side of the square: ";
        final String successMessage = " created";
        double side = AddDoubleValue.addValue(view, enterSide);
        Quad quad = new Quad(side);
        storage.add(quad);
        view.write(quad + successMessage);
    }
}
