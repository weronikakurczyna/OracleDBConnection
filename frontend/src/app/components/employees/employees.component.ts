import { Component, OnInit } from '@angular/core';
import {Employee} from "./employee";
import {EmployeesService} from "../../services/employees.service";

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.scss']
})
export class EmployeesComponent implements OnInit {

  private employees: Employee[];

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


}
