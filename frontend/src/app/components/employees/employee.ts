import {Location, LocationInterface} from "../locations/location";
import {Job, JobInterface} from "../jobs/job";
import {Department, DepartmentInterface} from "../departments/department";

export interface EmployeeInterface {
  employeeID: string;
  firstName: string;
  lastName: string;
  email: string;
  phoneNumber: string;
  hireDate: string;
  jobID: JobInterface;
  salary: number;
  commissionPct: number;
  managerID: EmployeeInterface;
  departmentID: DepartmentInterface;

}

export class Employee {
  constructor(fields: Partial<EmployeeInterface>) {
    this.employeeID = fields.employeeID;
    this.firstName = fields.firstName;
    this.lastName = fields.lastName;
    this.phoneNumber = fields.phoneNumber;
    this.email = fields.email;
    this.hireDate = fields.hireDate;
    this.jobID = new Job(fields.jobID);
    this.salary = fields.salary;
    this.commissionPct = fields.commissionPct;
    this.departmentID = new Department(fields.departmentID)
    this.managerID = new Employee(fields.managerID);
  }

  employeeID: string;
  firstName: string;
  lastName: string;
  email: string;
  phoneNumber: string;
  hireDate: string;
  jobID: Job;
  salary: number;
  commissionPct: number;
  managerID: Employee;
  departmentID: Department;

}
