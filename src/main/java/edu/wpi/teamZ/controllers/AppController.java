package edu.wpi.teamZ.controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppController {

  @FXML
  public void navMedicalEquipment(ActionEvent event) throws IOException {
    System.out.println("navigating to default from language interpreter");
    Parent root =
        FXMLLoader.load(
            getClass()
                .getClassLoader()
                .getResource("edu/wpi/teamZ/views/MedicalEquipmentDelivery.fxml"));
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  @FXML
  public void navLab(ActionEvent event) throws IOException {
    System.out.println("navigating to default from language interpreter");
    Parent root =
        FXMLLoader.load(
            getClass().getClassLoader().getResource("edu/wpi/teamZ/views/labServiceRequest.fxml"));
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  @FXML
  public void navMedicine(ActionEvent event) throws IOException {
    System.out.println("navigating to default from language interpreter");
    Parent root =
        FXMLLoader.load(
            getClass().getClassLoader().getResource("edu/wpi/teamZ/views/medicineRequest.fxml"));
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  @FXML
  public void navMeal(ActionEvent event) throws IOException {
    System.out.println("navigating to default from language interpreter");
    Parent root =
        FXMLLoader.load(
            getClass().getClassLoader().getResource("edu/wpi/teamZ/views/Meal Service.fxml"));
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  @FXML
  public void navLanguage(ActionEvent event) throws IOException {
    System.out.println("navigating to default from language interpreter");
    Parent root =
        FXMLLoader.load(
            getClass()
                .getClassLoader()
                .getResource("edu/wpi/teamZ/views/LanguageInterpreter.fxml"));
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  @FXML
  public void navLaundry(ActionEvent event) throws IOException {
    System.out.println("navigating to default from language interpreter");
    Parent root =
        FXMLLoader.load(
            getClass().getClassLoader().getResource("edu/wpi/teamZ/views/laundryService.fxml"));
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
}
