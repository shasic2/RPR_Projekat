package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInController {
    public Button OkDugmeId;
    public TextField usernameId;
    public PasswordField passwordId;

    public void akcija(ActionEvent ok) {

    }

    public void resetAciotn(ActionEvent reset) {
        usernameId.setText("");
        passwordId.setText("");

    }
}
