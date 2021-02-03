import {Injectable} from '@angular/core';
import {MainService} from "./main.service";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {map} from "rxjs/operators";
import {Region, RegionAttrs} from "../components/regions/region";


@Injectable({
  providedIn: 'root'
})
export class RegionsService extends MainService{
  private regionUrl: string = "regions";

  constructor(protected http: HttpClient) {
    super();
  }
  getRegions(): Observable<Region[]> {
    return this.http
      .get<RegionAttrs[]>(this.mainUrl + this.regionUrl, this.httpOptions)
      .pipe(map(data => data.map(regionAttrs => new Region(regionAttrs))));
  }
}
