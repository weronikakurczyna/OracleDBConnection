import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Location, LocationInterface} from "../components/locations/location";

@Injectable({
  providedIn: 'root'
})
export class LocationsService {

  private locationUrl: string = "http://localhost:8080/api/locations";
  private locationUrl2: string = "http://localhost:8080/api/location";

  constructor(protected http: HttpClient) {
  }

  getLocations(): Observable<Location[]> {
    return this.http
      .get<LocationInterface[]>(this.locationUrl);
  }

  deleteLocation(id: string): Observable<string> {
    const deleteUrl = `${this.locationUrl2}/${id}`;
    return this.http.delete<string>(deleteUrl);
  }

  insertLocation(formValues) {
    return this.http.post(this.locationUrl,formValues);
  }
}
