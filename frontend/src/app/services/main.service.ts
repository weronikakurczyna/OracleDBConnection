import {Injectable} from '@angular/core';
import {HttpHeaders} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class MainService {
  protected mainUrl: string = "http://localhost:8080/api/";
  protected httpOptions = {
    headers: new HttpHeaders({
      "Content-Type": "application/json"
    })
  };

  constructor() {
  }
}

