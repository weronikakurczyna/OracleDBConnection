import {Location, LocationInterface} from "../locations/location";
import {EmployeeInterface} from "../employees/employee";

export interface DepartmentInterface {
  departmentID: string;
  departmentName: string;
  locationID: LocationInterface;
}

export class Department {
  constructor(fields: Partial<DepartmentInterface>) {
    this.departmentID = fields.departmentID;
    this.departmentName = fields.departmentName;
    this.locationID = new Location(fields.locationID);
  }

  departmentID: string;
  departmentName: string;
  locationID: Location;

}
