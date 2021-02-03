package pl.weronika.kurczyna.model.entity;
import org.springframework.lang.Nullable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Date;

@Entity(name = "employees")
public class Employee {
    @javax.persistence.Id
    @Column(unique = true)
    private Integer employeeID;
    private String lastName;
    private String email;
    private Date hireDate;
    @ManyToOne
    private Job jobID;
    @Nullable
    private String firstName;
    @Nullable
    private String phoneNumber;
    @Nullable
    private Integer salary;
    @Nullable
    private Double commissionPCT;
    @ManyToOne
    @Nullable
    private Employee managerID;
    @ManyToOne
    @Nullable
    private Department departmentID;

    public Employee() {
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
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

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Job getJobID() {
        return jobID;
    }

    public void setJobID(Job jobID) {
        this.jobID = jobID;
    }

    @Nullable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(@Nullable String firstName) {
        this.firstName = firstName;
    }

    @Nullable
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@Nullable String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Nullable
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(@Nullable Integer salary) {
        this.salary = salary;
    }

    @Nullable
    public Double getCommissionPCT() {
        return commissionPCT;
    }

    public void setCommissionPCT(@Nullable Double commissionPCT) {
        this.commissionPCT = commissionPCT;
    }

    @Nullable
    public Employee getManagerID() {
        return managerID;
    }

    public void setManagerID(@Nullable Employee managerID) {
        this.managerID = managerID;
    }

    @Nullable
    public Department getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(@Nullable Department departmentID) {
        this.departmentID = departmentID;
    }
}


