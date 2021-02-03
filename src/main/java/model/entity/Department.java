package model.entity;

import org.springframework.lang.Nullable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name = "departments")
public class Department {
    @javax.persistence.Id
    @Column(unique = true)
    private Integer departmentID;
    private String departmentName;
    @ManyToOne
    @Nullable
    //@ForeignKey(name="dept_mgr_fk")
    private Employee managerID;
    @ManyToOne
    @Nullable
    //@ForeignKey(name="dept_loc_fk")
    private Location locationID;

    public Department() {
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
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
