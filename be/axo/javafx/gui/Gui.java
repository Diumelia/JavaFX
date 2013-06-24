package be.axo.javafx.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        final Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
        final Scene scene = new Scene(root, 366, 347);

        stage.setTitle("JavaFX Test");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
