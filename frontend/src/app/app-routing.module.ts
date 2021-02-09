import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CountriesComponent} from "./components/countries/countries.component";
import {DepartmentsComponent} from "./components/departments/departments.component";
import {EmployeesComponent} from "./components/employees/employees.component";
import {JobsComponent} from "./components/jobs/jobs.component";
import {LocationsComponent} from "./components/locations/locations.component";
import {RegionsComponent} from "./components/regions/regions.component";
import {JobGradesComponent} from "./components/job-grades/job-grades.component";
import {JobHistoryComponent} from "./components/job-history/job-history.component";

const routes: Routes = [
  {
    path: 'countries',
    component: CountriesComponent,
  },
  {
    path: 'departments',
    component: DepartmentsComponent,
  },
  {
    path: 'employees',
    component: EmployeesComponent
  },
  {
    path: 'jobs',
    component: JobsComponent
  },
  {
    path: 'locations',
    component: LocationsComponent
  },
  {
    path: 'regions',
    component: RegionsComponent
  },
  {
    path: 'job-grades',
    component: JobGradesComponent
  },
  {
    path: 'job-history',
    component: JobHistoryComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
