package application;

import controller.BddController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BddController bddController = new BddController();
        bddController.connect();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
