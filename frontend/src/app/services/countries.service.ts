import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Country, CountryInterface} from "../components/countries/country";


@Injectable({
  providedIn: 'root'
})

export class CountriesService {
  private countryUrl: string = "http://localhost:8080/api/countries";
  private countryUrl2: string = "http://localhost:8080/api/country";

  constructor(protected http: HttpClient) {
  }

  getCountries(): Observable<Country[]> {
    return this.http
      .get<CountryInterface[]>(this.countryUrl);
  }

  deleteCountry(id: string): Observable<string> {
    const deleteUrl = `${this.countryUrl2}/${id}`;
    return this.http.delete<string>(deleteUrl);
  }

  insertCountry(formValues) {
    return this.http.post(this.countryUrl,formValues);
  }
}
