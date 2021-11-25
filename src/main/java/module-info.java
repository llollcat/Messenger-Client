module Messenger.Client {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;


    requires org.apache.httpcomponents.httpclient;
    requires org.apache.commons.codec;
    requires org.apache.httpcomponents.httpcore;
    requires json.simple;


    opens messengerClient;
    opens messengerClient.controllers;
    requires java.desktop;
}