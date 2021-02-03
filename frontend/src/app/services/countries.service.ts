import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {map} from "rxjs/operators";
import {Country, CountryAttrs} from "../components/countries/country";
import {MainService} from "./main.service";

@Injectable({
  providedIn: 'root'
})
export class CountriesService extends MainService {
  private countryUrl: string = "countries";

  constructor(protected http: HttpClient) {
    super();
  }

  getCountries(): Observable<Country[]> {
    return this.http
      .get<CountryAttrs[]>(this.mainUrl + this.countryUrl, this.httpOptions)
      .pipe(map(data => data.map(countryAttrs => new Country(countryAttrs))));
  }
}
