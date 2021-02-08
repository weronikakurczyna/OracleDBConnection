import {Component, OnInit} from '@angular/core';
import {Country} from "../countries/country";
import {CountriesService} from "../../services/countries.service";
import {Department} from "./department";
import {DepartmentsService} from "../../services/departments.service";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-departments',
  templateUrl: './departments.component.html',
  styleUrls: ['./departments.component.scss']
})
export class DepartmentsComponent implements OnInit {

  departments: Department[];
  departmentForm = new FormGroup({
    departmentID: new FormControl(),
    departmentName: new FormControl()
  });

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

  onDelete(departmentID: string) {
    this.departmentsService.deleteDepartment(departmentID)
      .subscribe(() => console.log(`Department with ID = ${departmentID} deleted`));
    this.refresh();
  }

  private onInsert(): void {
    this.departmentsService.insertDepartment(this.departmentForm.value).subscribe(() => console.log('Department added'));
    this.refresh();
  }

  refresh(): void {
    window.location.reload();
  }

}
