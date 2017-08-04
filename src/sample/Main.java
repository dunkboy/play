package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//javapackager -deploy -appclass sample.Main -native image -srcdir jar -outdir deploy -outfile play
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Timestamp Converter");
        primaryStage.setScene(new Scene(root, 671, 183));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
