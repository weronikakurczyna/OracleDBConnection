import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Country, CountryInterface} from "../components/countries/country";
import {Department, DepartmentInterface} from "../components/departments/department";

@Injectable({
  providedIn: 'root'
})
export class DepartmentsService {
  private departmentUrl: string = "http://localhost:8080/api/departments";
  private departmentUrl2: string = "http://localhost:8080/api/department";

  constructor(protected http: HttpClient) {
  }

  getDepartments(): Observable<Department[]> {
    return this.http
      .get<DepartmentInterface[]>(this.departmentUrl);
  }

  getDepartmentsWithID(id): Observable<Department> {
    const newUrl = `${this.departmentUrl2}/${id}`;
    return this.http
      .get<DepartmentInterface>(newUrl);
  }


  deleteDepartment(id: string): Observable<string> {
    const deleteUrl = `${this.departmentUrl2}/${id}`;
    return this.http.delete<string>(deleteUrl);
  }

  insertDepartment(formValues) {
    return this.http.post(this.departmentUrl,formValues);
  }
}
