package ua.goit.controller.command;

import ua.goit.model.Circle;
import ua.goit.repository.Storage;
import ua.goit.view.View;

public class AddCircle implements Command{

    private final View view;
    private final Storage storage;
    private final static String COMMAND_NAME = "addCircle";

    public AddCircle(View view, Storage storage) {
        this.view = view;
        this.storage = storage;
    }

    @Override
    public boolean canProcess(String input) {
        return input.equals(COMMAND_NAME);
    }

    @Override
    public void process() {
        double radius = 0;
        while (true){
            try {
                view.write("Enter the radius of the circle: ");
                radius = Double.parseDouble(view.read());
                break;
            }catch (NumberFormatException e){
                view.write("Try again. Enter the correct number: ");
            }
        }
        Circle circle = new Circle(radius);
        storage.add(circle);
        view.write(circle + " created");
    }
}
