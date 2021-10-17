package ua.goit.controller.command;

import ua.goit.view.View;

public class Exit implements Command{
    private final View view;
    private final static String COMMAND_NAME = "exit";

    public Exit(View view) {
        this.view = view;
    }

    @Override
    public boolean canProcess(String input) {
        return input.equals(COMMAND_NAME);
    }

    @Override
    public void process() {
        final String bye = "Good bye!";
        view.write(bye);
        System.exit(0);
    }
}
