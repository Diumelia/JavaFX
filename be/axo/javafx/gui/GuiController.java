package be.axo.javafx.gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class GuiController implements Initializable {
    @FXML
    private Button btnStart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnStart.setText("Start...");
    }
}
