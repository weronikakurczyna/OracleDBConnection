import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Location, LocationInterface} from "../components/locations/location";
import {Job, JobInterface} from "../components/jobs/job";

@Injectable({
  providedIn: 'root'
})
export class JobsService {
  private jobUrl: string = "http://localhost:8080/api/jobs";

  constructor(protected http: HttpClient) {
  }

  getJobs(): Observable<Job[]> {
    return this.http
      .get<JobInterface[]>(this.jobUrl);
  }
}
