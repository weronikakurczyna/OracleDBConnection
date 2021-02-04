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

  constructor(protected http: HttpClient) {
  }

  getDepartments(): Observable<Department[]> {
    return this.http
      .get<DepartmentInterface[]>(this.departmentUrl);
  }
}
