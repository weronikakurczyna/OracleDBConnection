import {Employee, EmployeeInterface} from "../employees/employee";
import {Job, JobInterface} from "../jobs/job";
import {Department, DepartmentInterface} from "../departments/department";

export interface JobHistoryInterface {
  employeeID: EmployeeInterface;
  startDate: string;
  endDate: string;
  jobID: JobInterface;
  departmentID: DepartmentInterface;
}

export class JobHistory {
  constructor(fields: Partial<JobHistoryInterface>) {
    this.employeeID = new Employee(fields.employeeID)
    this.startDate = fields.startDate;
    this.endDate = fields.endDate;
    this.jobID = new Job(fields.jobID);
    this.departmentID = new Department(fields.departmentID);
  }
  employeeID: Employee;
  startDate: string;
  endDate: string;
  jobID: Job;
  departmentID: Department;

}
