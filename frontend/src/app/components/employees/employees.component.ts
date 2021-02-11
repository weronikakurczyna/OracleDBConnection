import { Component, OnInit } from '@angular/core';
import {Employee} from "./employee";
import {EmployeesService} from "../../services/employees.service";

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.scss']
})
export class EmployeesComponent implements OnInit {

  employees: Employee[];
  employeesWithSalaryAndCommissionPCT: Employee[];
  salary = 15000;
  commissionPCT = 0.2;


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
    this.showSalaryAndCommissionPCTInfo(this.salary,this.commissionPCT);
  }

  private showInfo() {
    this.employeesService
      .getEmployees()
      .subscribe((data: Employee[]) => this.employees = data);
  }

  private showSalaryAndCommissionPCTInfo(salary: number, commissionPCT: number) {
    this.employeesService
      .getEmployeesWithSalaryLowerThanAndCommissionPCT(salary, commissionPCT)
      .subscribe((data: Employee[]) => this.employeesWithSalaryAndCommissionPCT = data);
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


}
