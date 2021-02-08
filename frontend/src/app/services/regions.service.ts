import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Region, RegionInterface} from "../components/regions/region";


@Injectable({
  providedIn: 'root'
})
export class RegionsService {
  private regionUrl: string = "http://localhost:8080/api/regions";
  private regionUrl2: string = "http://localhost:8080/api/region";

  constructor(protected http: HttpClient) {
  }

  getRegions(): Observable<Region[]> {
    return this.http
      .get<RegionInterface[]>(this.regionUrl);
  }

  deleteRegion(id: string): Observable<string> {
    const deleteUrl = `${this.regionUrl2}/${id}`;
    return this.http.delete<string>(deleteUrl);
  }

  insertRegion(formValues) {
    return this.http.post(this.regionUrl,formValues);
  }

}
