package edu.wpi.teamZ;

public class LabServiceRequest {
  private String employeeName;
  private int employeeID;
  private String labType;
  private String status;
  private String staffAssigned;

  // getterFunctions
  public String getEmployeeName() {
    return employeeName;
  }

  public int getEmployeeID() {
    return employeeID;
  }

  public String getLabType() {
    return labType;
  }

  public String getStatus() {
    return status;
  }

  public String getStaffAssigned() {
    return staffAssigned;
  }

  // setterFunctions
  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
  }

  public void setLabType(String labType) {
    this.labType = labType;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setStaffAssigned(String staffAssigned) {
    this.staffAssigned = staffAssigned;
  }
}
