package ua.goit;

import ua.goit.controller.GraphicEditorController;
import ua.goit.repository.InMemoryStorage;
import ua.goit.repository.Storage;
import ua.goit.view.Console;
import ua.goit.view.View;

public class Application {
    public static void main(String[] args) {
        View view = new Console();
        Storage storage = new InMemoryStorage();
        GraphicEditorController graphicEditorController = new GraphicEditorController(view, storage);
        graphicEditorController.run();
    }
}
