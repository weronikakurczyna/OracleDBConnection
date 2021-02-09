import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import {RouterModule} from "@angular/router";
import { CountriesComponent } from './components/countries/countries.component';
import { DepartmentsComponent } from './components/departments/departments.component';
import { EmployeesComponent } from './components/employees/employees.component';
import { JobsComponent } from './components/jobs/jobs.component';
import { LocationsComponent } from './components/locations/locations.component';
import { RegionsComponent } from './components/regions/regions.component';
import {FormsModule} from "@angular/forms";
import { ReactiveFormsModule } from "@angular/forms";
import { JobGradesComponent } from './components/job-grades/job-grades.component';
import { JobHistoryComponent } from './components/job-history/job-history.component';


@NgModule({
  declarations: [
    AppComponent,
    CountriesComponent,
    DepartmentsComponent,
    EmployeesComponent,
    JobsComponent,
    LocationsComponent,
    RegionsComponent,
    JobGradesComponent,
    JobHistoryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
