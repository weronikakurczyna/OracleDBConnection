import {Component, OnInit} from '@angular/core';
import {Country} from "../countries/country";
import {CountriesService} from "../../services/countries.service";
import {Department} from "./department";
import {DepartmentsService} from "../../services/departments.service";
import {FormControl, FormGroup} from "@angular/forms";
import {Employee} from "../employees/employee";

@Component({
  selector: 'app-departments',
  templateUrl: './departments.component.html',
  styleUrls: ['./departments.component.scss']
})
export class DepartmentsComponent implements OnInit {

  departments: Department[];
  departmentWithID: Department;

  departmentForm = new FormGroup({
    departmentID: new FormControl(),
    departmentName: new FormControl()
  });
  departmentFormID = new FormGroup({
    departmentID: new FormControl(),
  });

  constructor(private departmentsService: DepartmentsService) {
  }

  ngOnInit(): void {
    this.showInfo();
  }

  showDepartmentWithID() {
    const departmentId = this.departmentFormID.value.departmentID;
    console.log(departmentId)
    this.departmentsService
      .getDepartmentsWithID(departmentId)
      .subscribe((response: Department) => {
        this.departmentWithID = response
      });
  }


  showInfo() {
    this.departmentsService
      .getDepartments()
      .subscribe((data: Department[]) => this.departments = data);
  }

  onDelete(departmentID: string) {
    this.departmentsService.deleteDepartment(departmentID)
      .subscribe(() => {
        console.log(`Department with ID = ${departmentID} deleted`)
        this.showInfo()
      });
  }

  onInsert(): void {
    this.departmentsService.insertDepartment(this.departmentForm.value).subscribe(() => {
      console.log('Department added')
      this.showInfo()
    });
  }


}
