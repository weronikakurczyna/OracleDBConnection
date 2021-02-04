import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Country, CountryInterface} from "../components/countries/country";
import {Location, LocationInterface} from "../components/locations/location";

@Injectable({
  providedIn: 'root'
})
export class LocationsService {

  private locationUrl: string = "http://localhost:8080/api/locations";

  constructor(protected http: HttpClient) {
  }

  getLocations(): Observable<Location[]> {
    return this.http
      .get<LocationInterface[]>(this.locationUrl);
  }
}
