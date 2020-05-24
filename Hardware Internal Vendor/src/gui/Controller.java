package gui;

import javafx.event.ActionEvent;

public class Controller {
    public void pressLoginButton(ActionEvent event) {
        System.out.println("Logged in");
    }

    public void pressLoginAsGuest(ActionEvent event) {
        System.out.println("Logged in as guest");
    }
}
