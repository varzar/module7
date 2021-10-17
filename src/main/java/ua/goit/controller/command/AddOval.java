package ua.goit.controller.command;

import ua.goit.model.Oval;
import ua.goit.repository.Storage;
import ua.goit.view.View;

public class AddOval implements Command{
    private final View view;
    private final Storage storage;
    private final static String COMMAND_NAME = "addOval";

    public AddOval(View view, Storage storage) {
        this.view = view;
        this.storage = storage;
    }

    @Override
    public boolean canProcess(String input) {
        return input.equals(COMMAND_NAME);
    }

    @Override
    public void process() {
        final String enterRadiusMinor = "Enter a smaller radius of the oval: ";
        final String enterRadiusMajor = "Enter a bigger radius of the oval: ";
        final String successMessage = " created";
        double rMinor = AddDoubleValue.addValue(view,enterRadiusMinor);
        double rMajor = AddDoubleValue.addValue(view,enterRadiusMajor);
        Oval oval = new Oval(rMinor, rMajor);
        storage.add(oval);
        view.write(oval + successMessage);
    }
}
