import { Component, OnInit } from '@angular/core';
import {Department} from "../departments/department";
import {DepartmentsService} from "../../services/departments.service";
import {LocationsService} from "../../services/locations.service";
import {Location} from "./location";

@Component({
  selector: 'app-locations',
  templateUrl: './locations.component.html',
  styleUrls: ['./locations.component.scss']
})
export class LocationsComponent implements OnInit {

  private locations: Location[];

  constructor(private locationsService: LocationsService) {
  }

  ngOnInit(): void {
    this.showInfo();
  }

  private showInfo() {
    this.locationsService
      .getLocations()
      .subscribe((data: Location[]) => this.locations = data);
  }

}
