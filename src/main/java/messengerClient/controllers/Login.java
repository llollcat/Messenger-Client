package messengerClient.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyEvent;
import messengerClient.DataReceiver;

import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {


    @FXML
    private Button registrationButton;
    @FXML
    private Button loginButton;


    @FXML
    private TextField loginTextField;
    @FXML
    private PasswordField passwordTextField;



    @FXML
    public void onLoginClick(){
        String login = loginTextField.getText();
        String password = passwordTextField.getText();

        String result = DataReceiver.login(login, password);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(result);

        alert.showAndWait();
    }
    @FXML
    public void onRegistrationClick(){
        String login = loginTextField.getText();
        String password = passwordTextField.getText();

        String result =  DataReceiver.registration(login, password);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(result);

        alert.showAndWait();


    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

       // loginButton.addEventHandler(MouseEvent.MOUSE_CLICKED , mouseEvent -> onLoginClick());
       // registrationButton.addEventHandler(MouseEvent.MOUSE_CLICKED , mouseEvent -> onRegistrationButton());


    }





}
