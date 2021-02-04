package pl.weronika.kurczyna.model.dto;

import java.sql.Date;

public class EmployeeDto {
    private String employeeID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private JobDto jobID;
    private Integer salary;
    private Double commissionPCT;
    private EmployeeDto managerID;
    private DepartmentDto departmentID;

    public EmployeeDto getManagerID() {
        return managerID;
    }

    public void setManagerID(EmployeeDto managerID) {
        this.managerID = managerID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public JobDto getJobID() {
        return jobID;
    }

    public void setJobID(JobDto jobID) {
        this.jobID = jobID;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Double getCommissionPCT() {
        return commissionPCT;
    }

    public void setCommissionPCT(Double commissionPCT) {
        this.commissionPCT = commissionPCT;
    }

    public DepartmentDto getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(DepartmentDto departmentID) {
        this.departmentID = departmentID;
    }
}
