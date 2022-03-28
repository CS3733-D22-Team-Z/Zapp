package edu.wpi.teamZ.controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class homepageController {
  @FXML private Label label;

  @FXML
  private void toLocations(ActionEvent event) throws IOException {
    Parent root =
        FXMLLoader.load(getClass().getClassLoader().getResource("edu/wpi/teamZ/views/app.fxml"));
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private void toLandingPage(ActionEvent event) throws IOException {
    Parent root =
        FXMLLoader.load(getClass().getClassLoader().getResource("edu/wpi/teamZ/views/app.fxml"));
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private void toMedicalEquipmentRequest(ActionEvent event) throws IOException {
    Parent root =
        FXMLLoader.load(getClass().getClassLoader().getResource("edu/wpi/teamz/views/app.fxml"));
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
