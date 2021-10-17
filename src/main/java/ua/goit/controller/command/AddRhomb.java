package ua.goit.controller.command;

import ua.goit.model.Rhomb;
import ua.goit.repository.Storage;
import ua.goit.view.View;

public class AddRhomb implements Command{
    private final View view;
    private final Storage storage;
    private static final String COMMAND_NAME = "addRhomb";

    public AddRhomb(View view, Storage storage) {
        this.view = view;
        this.storage = storage;
    }

    @Override
    public boolean canProcess(String input) {
        return input.equals(COMMAND_NAME);
    }

    @Override
    public void process() {
        final String enterSide = "Enter the length of the side of the rhomb: ";
        final String enterRadiusCircle = "Enter the radius inscribed circle of the rhomb: ";
        final String successMessage = " created";
        double side = AddDoubleValue.addValue(view, enterSide);
        double radiusInscribedCircle = AddDoubleValue.addValue(view, enterRadiusCircle);
        Rhomb rhomb = new Rhomb(side, radiusInscribedCircle);
        storage.add(rhomb);
        view.write(rhomb + successMessage);
    }
}
