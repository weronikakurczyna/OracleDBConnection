package pl.weronika.kurczyna.model.dto;

import java.sql.Date;

public class JobHistoryDto {
    private EmployeeDto employeeID;
    private Date startDate;
    private Date endDate;
    private JobDto jobID;
    private DepartmentDto departmentID;

    public EmployeeDto getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(EmployeeDto employeeID) {
        this.employeeID = employeeID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public JobDto getJobID() {
        return jobID;
    }

    public void setJobID(JobDto jobID) {
        this.jobID = jobID;
    }

    public DepartmentDto getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(DepartmentDto departmentID) {
        this.departmentID = departmentID;
    }
}
