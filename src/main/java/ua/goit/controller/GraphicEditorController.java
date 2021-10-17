package ua.goit.controller;

import ua.goit.controller.command.*;
import ua.goit.repository.Storage;
import ua.goit.view.View;

public class GraphicEditorController {
    private final View view;
    private final Command [] commands;

    public GraphicEditorController(View view, Storage storage) {
        this.view = view;
        this.commands = new Command[]{new Help(view), new Exit(view), new FindAll(view, storage),
                        new AddCircle(view, storage), new AddOval(view, storage), new AddQuad(view, storage),
                        new AddRectangle(view, storage), new AddRhomb(view, storage),
                        new AddRightTriangle(view, storage), new AddTriangle(view,storage)};
    }

    public void run(){
        view.write("Welcome to graphic editor!");
        executeCommand();
    }

    private void executeCommand() {
        final String toHelp = "Please, enter\n help \nto see available commands: ";
        final String wrongCommand = "Incorrect command. Please, try again.";
        while (true){
            view.write(toHelp);
            String input = view.read();
            boolean incorrectCommand = true;
            for (Command command:commands) {
                if(command.canProcess(input)){
                    command.process();
                    incorrectCommand = false;
                }
            }
            if (incorrectCommand){
                view.write(wrongCommand);
            }
        }
    }
}
