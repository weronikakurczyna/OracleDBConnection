import { Component, OnInit } from '@angular/core';
import {LocationsService} from "../../services/locations.service";
import {Location} from "./location";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-locations',
  templateUrl: './locations.component.html',
  styleUrls: ['./locations.component.scss']
})
export class LocationsComponent implements OnInit {

  locations: Location[];

  locationForm = new FormGroup({
    locationID: new FormControl(),
    streetAddress: new FormControl(),
    postalCode: new FormControl(),
    city: new FormControl(),
    stateProvince: new FormControl(),
    countryID: new FormControl(null)
  })

  constructor(private locationsService: LocationsService) {
  }

  ngOnInit(): void {
    this.showInfo();
  }

    showInfo() {
    this.locationsService
      .getLocations()
      .subscribe((data: Location[]) => this.locations = data);
  }

  onDelete(locationID: string) {
    this.locationsService.deleteLocation(locationID)
      .subscribe(() => console.log(`Location with ID = ${locationID} deleted`));
    this.refresh();
  }

    onInsert(): void {
    this.locationsService.insertLocation(this.locationForm.value).subscribe(() => console.log('Location added'));
    this.refresh();
  }

  refresh(): void {
    window.location.reload();
  }

}
