module Messenger.Client {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;

    opens messengerClient;
    opens messengerClient.controllers;
    requires java.desktop;
}