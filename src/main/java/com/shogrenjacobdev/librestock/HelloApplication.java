package com.shogrenjacobdev.librestock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        DbAccess Db = new DbAccess();
        Item test = Db.getItemById(1);
        System.out.println("ItemName: " + test.getName());
        System.out.println("ItemId: " + test.getId());
        System.out.println("ItemSKU: " + test.getSku());
        System.out.println("ItemQuantity: " + test.getQuantity());
        System.out.println("ItemCollection: " + test.getCollection());

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
