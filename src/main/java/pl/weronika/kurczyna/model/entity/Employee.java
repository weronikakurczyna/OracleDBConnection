package pl.weronika.kurczyna.model.entity;
import org.springframework.lang.Nullable;
import javax.persistence.*;
import java.sql.Date;

@Entity(name = "employees")
@Table(name = "EMPLOYEES")
public class Employee {
    @Id
    @Column(unique = true, name = "EMPLOYEE_ID")
    private String employeeID;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "HIRE_DATE")
    private Date hireDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "JOB_ID")
    private Job job;
    @Nullable
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Nullable
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Nullable
    @Column(name = "SALARY")
    private Integer salary;
    @Nullable
    @Column(name = "COMMISSION_PCT")
    private Double commissionPCT;
    @ManyToOne(fetch = FetchType.EAGER)
    @Nullable
    @JoinColumn(name = "MANAGER_ID")
    private Employee managerID;
    @ManyToOne(fetch = FetchType.EAGER)
    @Nullable
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department departmentID;

    public Employee() {
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
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

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
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


