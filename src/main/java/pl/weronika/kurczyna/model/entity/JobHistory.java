package pl.weronika.kurczyna.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "jobHistory")
@Table(name = "JOB_HISTORY")
@IdClass(CompositeKey.class)
public class JobHistory {
    @Id
    @JoinColumn(unique = true, name = "EMPLOYEE_ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Employee employeeID;
    @Id
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "END_DATE")
    private Date endDate;
    @JoinColumn(name = "JOB_ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Job jobID;
    @JoinColumn(name = "DEPARTMENT_ID")
    @Nullable
    @ManyToOne(fetch = FetchType.EAGER)
    private Department departmentID;

    public Employee getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Employee employeeID) {
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

    public Job getJobID() {
        return jobID;
    }

    public void setJobID(Job jobID) {
        this.jobID = jobID;
    }

    @Nullable
    public Department getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(@Nullable Department departmentID) {
        this.departmentID = departmentID;
    }
}
