import { Component, OnInit } from '@angular/core';
import {Employee} from "./employee";
import {EmployeesService} from "../../services/employees.service";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.scss']
})
export class EmployeesComponent implements OnInit {

  employees: Employee[];

  // employeeForm = new FormGroup({
  //   employeeID: new FormControl(),
  //   firstName: new FormControl(),
  //   lastName: new FormControl(),
  //   email: new FormControl(),
  //   phoneNumber: new FormControl(),
  //   hireDate: new FormControl(),
  //   salary: new FormControl(),
  //   commissionPct: new FormControl()
  // })

  constructor(private employeesService: EmployeesService) {
  }

  ngOnInit(): void {
    this.showInfo();
  }

  private showInfo() {
    this.employeesService
      .getEmployees()
      .subscribe((data: Employee[]) => this.employees = data);
  }

  // onDelete(employeeID: string) {
  //   this.employeesService.deleteEmployee(employeeID)
  //     .subscribe(() => console.log(`Employee with ID = ${employeeID} deleted`));
  //   this.refresh();
  // }

  // private onInsert(): void {
  //   this.employeesService.insertEmployee(this.employeeForm.value).subscribe(() => console.log('Employee added'));
  //   //this.refresh();
  // }

  refresh(): void {
    window.location.reload();
  }



}
