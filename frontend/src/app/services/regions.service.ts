import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Region, RegionInterface} from "../components/regions/region";


@Injectable({
  providedIn: 'root'
})
export class RegionsService {
  private regionUrl: string = "http://localhost:8080/api/regions";

  constructor(protected http: HttpClient) {
  }

  getRegions(): Observable<Region[]> {
    return this.http
      .get<RegionInterface[]>(this.regionUrl);
  }
}
