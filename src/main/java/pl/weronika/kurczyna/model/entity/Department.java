package pl.weronika.kurczyna.model.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity(name = "departments")
@Table(name = "DEPARTMENTS")
public class Department {
    @Id
    @Column(unique = true, name = "DEPARTMENT_ID")
    private String departmentID;
    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;
    @JoinColumn(name = "MANAGER_ID")
    @ManyToOne(fetch = FetchType.EAGER)
    @Nullable
    private Employee managerID;
    @JoinColumn(name = "LOCATION_ID")
    @ManyToOne(fetch = FetchType.EAGER)
    @Nullable
    private Location locationID;
//    @OneToMany(
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    private List<Employee> comments = new ArrayList<>();
//
//    public Department() {
//    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Nullable
    public Employee getManagerID() {
        return managerID;
    }

    public void setManagerID(@Nullable Employee managerID) {
        this.managerID = managerID;
    }

    @Nullable
    public Location getLocationID() {
        return locationID;
    }

    public void setLocationID(@Nullable Location locationID) {
        this.locationID = locationID;
    }
}
