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


@NgModule({
  declarations: [
    AppComponent,
    CountriesComponent,
    DepartmentsComponent,
    EmployeesComponent,
    JobsComponent,
    LocationsComponent,
    RegionsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path: "countries", component: CountriesComponent},
      {path: "departments", component: DepartmentsComponent},
      {path: "employees", component: EmployeesComponent},
      {path: "jobs", component: JobsComponent},
      {path: "locations", component: LocationsComponent},
      {path: "regions", component: RegionsComponent}
    ]),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
