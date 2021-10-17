package ua.goit.controller.command;

import ua.goit.view.View;

public class Help implements Command{
    private final View view;
    private final static String COMMAND_NAME = "help";

    public Help(View view) {
        this.view = view;
    }

    @Override
    public boolean canProcess(String input) {
        return input.equals(COMMAND_NAME);
    }

    @Override
    public void process() {
        view.write("Enter\n help             to see available commands: ");
        view.write(" exit             to exit.");
        view.write(" addCircle        to add circle to storage");
        view.write(" addOval          to add oval to storage");
        view.write(" addQuad          to add quad to storage");
        view.write(" addRectangle     to add rectangle to storage");
        view.write(" addRhomb         to add rhomb to storage");
        view.write(" addRightTriangle to add right triangle to storage");
        view.write(" addTriangle      to add triangle to storage");
        view.write(" findAll          to view all saved shapes");
    }
}
