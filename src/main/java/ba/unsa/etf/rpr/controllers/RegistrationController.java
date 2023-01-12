package ba.unsa.etf.rpr.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistrationController {
    public TextField usernameId;
    public TextField surnameId;
    public PasswordField PasswordId;
    public PasswordField ConfPassId;
    public TextField nameId;

    public void CancleAction(ActionEvent actionEvent) {
        usernameId.setText("");
        surnameId.setText("");
        nameId.setText("");
        PasswordId.setText("");
        ConfPassId.setText("");

    }

    public void OkAction(ActionEvent actionEvent) {
    }
}
