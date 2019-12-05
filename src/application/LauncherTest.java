package application;

import controller.BddController;

public class LauncherTest {
    public static void main(String[] args) {
        BddController bddController = new BddController();
        if (bddController.connect()) {
            System.out.println("Connected to Data Base");
        }
    }
}
