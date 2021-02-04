import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Department, DepartmentInterface} from "../components/departments/department";
import {Employee, EmployeeInterface} from "../components/employees/employee";

@Injectable({
  providedIn: 'root'
})
export class EmployeesService {

  private employeeUrl: string = "http://localhost:8080/api/employees";

  constructor(protected http: HttpClient) {
  }

  getEmployees(): Observable<Employee[]> {
    return this.http
      .get<EmployeeInterface[]>(this.employeeUrl);

  }
}

