package pl.weronika.kurczyna.model.dto;

public class DepartmentDto {
    private String departmentID;
    private String departmentName;
    private LocationDto locationID;

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

    public LocationDto getLocationID() {
        return locationID;
    }

    public void setLocationID(LocationDto locationID) {
        this.locationID = locationID;
    }
}
