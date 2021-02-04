import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Country, CountryInterface} from "../components/countries/country";


@Injectable({
  providedIn: 'root'
})

export class CountriesService {
  private countryUrl: string = "http://localhost:8080/api/countries";

  constructor(protected http: HttpClient) {
  }

  getCountries(): Observable<Country[]> {
    return this.http
      .get<CountryInterface[]>(this.countryUrl);
  }
}
