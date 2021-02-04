import { Component, OnInit } from '@angular/core';
import {Country} from "../countries/country";
import {CountriesService} from "../../services/countries.service";
import {Department} from "./department";
import {DepartmentsService} from "../../services/departments.service";

@Component({
  selector: 'app-departments',
  templateUrl: './departments.component.html',
  styleUrls: ['./departments.component.scss']
})
export class DepartmentsComponent implements OnInit {

  private departments: Department[];

  constructor(private departmentsService: DepartmentsService) {
  }

  ngOnInit(): void {
    this.showInfo();
  }

  private showInfo() {
    this.departmentsService
      .getDepartments()
      .subscribe((data: Department[]) => this.departments = data);
  }

}
