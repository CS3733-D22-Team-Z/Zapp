package edu.wpi.teamZ.controllers;

import com.jfoenix.controls.JFXButton;
import edu.wpi.teamZ.App;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AppController {
  @FXML private Label landingPageLabel;
  @FXML private JFXButton fwdButton;

  public void onClicked() throws IOException {
    Stage mainStage = (Stage) fwdButton.getScene().getWindow();
    Parent root = FXMLLoader.load(App.class.getResource("views/labServiceRequest.fxml"));
    Scene scene = new Scene(root);
    mainStage.setScene(scene);
  }
}
