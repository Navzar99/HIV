package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.security.NoSuchAlgorithmException;

public class loginController {
    @FXML
    TextField username_login;
    @FXML
    PasswordField password_login;

    public void pressLoginButton(ActionEvent event) throws NoSuchAlgorithmException {
        String username = username_login.getText();
        String password = password_login.getText();

        if (password == null || password.isEmpty() ) {

            System.out.println("No password");
            return;
        }
        if (username == null || username.isEmpty()) {
            System.out.println("No username");
            return;
        }

        System.out.println("Username: " + username + "\nPassword: " + password);
    }

    public void pressLoginAsGuest(ActionEvent event) {
        System.out.println("Logged in as guest");
    }






}
