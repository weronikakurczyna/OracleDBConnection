import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs";
import {Department, DepartmentInterface} from "../components/departments/department";
import {Employee, EmployeeInterface} from "../components/employees/employee";

@Injectable({
  providedIn: 'root'
})
export class EmployeesService {

  private employeeUrl: string = "http://localhost:8080/api/employees";
  private employeeByParams: string = "http://localhost:8080/api/employeeByParams";

  constructor(protected http: HttpClient) {
  }

  getEmployees(): Observable<Employee[]> {
    return this.http
      .get<EmployeeInterface[]>(this.employeeUrl);

  }

  getEmployeesWithSalaryLowerThanAndCommissionPCT(salary, commissionPCT): Observable<Employee[]> {
    const params = new HttpParams().append('maxSalary', salary).append('commissionPCT', commissionPCT);
    console.log(salary)
    console.log(commissionPCT)
    console.log(params)
    return this.http.get<EmployeeInterface[]>(this.employeeByParams, {params});
    //   return this.http.get<EmployeeInterface[]>(this.employeeByParams, {params});
  }

  // deleteEmployee(id: string): Observable<string> {
  //   const deleteUrl = `${this.employeeUrl2}/${id}`;
  //   return this.http.delete<string>(deleteUrl);
  // }

  // insertEmployee(formValues) {
  //   return this.http.post(this.employeeUrl,formValues);
  // }

}

