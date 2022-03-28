package edu.wpi.teamZ;

public class LanguageInterpreter {
  private String patientName;
  private String patientID;
  private String roomNumber;
  private String language;
  private String status;
  private String staffAssigned;

  // GetterFunctions
  public String getPatientName() {
    return patientName;
  }

  public String getPatientID() {
    return patientID;
  }

  public String getRoomNumber() {
    return roomNumber;
  }

  public String getLanguage() {
    return language;
  }

  public String getStatus() {
    return status;
  }

  public String getStaffAssigned() {
    return staffAssigned;
  }

  // SetterFunctions
  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }

  public void setPatientID(String patientID) {
    this.patientID = patientID;
  }

  public void setRoomNumber(String roomNumber) {
    this.roomNumber = roomNumber;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStaffAssigned(String staffAssigned) {
    this.staffAssigned = staffAssigned;
  }
}
