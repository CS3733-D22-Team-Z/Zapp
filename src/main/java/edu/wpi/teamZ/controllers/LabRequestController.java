package edu.wpi.teamZ.controllers;

import com.jfoenix.controls.JFXButton;
import edu.wpi.teamZ.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LabRequestController {
  @FXML private JFXButton backButton;

  @FXML
  public void onBackButtonClicked(ActionEvent event) throws IOException {
    System.out.println("Lets go back now");

    Stage mainStage = (Stage) backButton.getScene().getWindow();
    Parent root = FXMLLoader.load(App.class.getResource("views/app.fxml"));
    Scene scene = new Scene(root);
    mainStage.setScene(scene);
  }
}
