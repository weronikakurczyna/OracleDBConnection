package pl.weronika.kurczyna.model.dto;

public class DepartmentDto {
    private Integer departmentID;
    private String departmentName;
    private LocationDto locationID;
    private Integer managerID;

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

    public LocationDto getLocationID() {
        return locationID;
    }

    public void setLocationID(LocationDto locationID) {
        this.locationID = locationID;
    }

    public Integer getManagerID() {
        return managerID;
    }

    public void setManagerID(Integer managerID) {
        this.managerID = managerID;
    }
}
