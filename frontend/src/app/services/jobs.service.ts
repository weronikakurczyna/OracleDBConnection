import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs";
import {Location, LocationInterface} from "../components/locations/location";
import {Job, JobInterface} from "../components/jobs/job";
import {FormGroup} from "@angular/forms";
import {Employee, EmployeeInterface} from "../components/employees/employee";

@Injectable({
  providedIn: 'root'
})
export class JobsService {
  private jobUrl: string = "http://localhost:8080/api/jobs";
  private jobUrl2: string = "http://localhost:8080/api/job";
  private jobByParams: string = "http://localhost:8080/api/jobByParams";

  constructor(protected http: HttpClient) {
  }

  getJobs(): Observable<Job[]> {
    return this.http
      .get<JobInterface[]>(this.jobUrl);
  }

  getJobsWithMaxSalaryGreaterThanAndJobTitleContains(maxSalary, jobTitle): Observable<Job[]> {
    const params = new HttpParams().append('maxSalary', maxSalary).append('jobTitle', jobTitle);
    console.log(maxSalary)
    console.log(jobTitle)
    console.log(params)
    return this.http.get<JobInterface[]>(this.jobByParams, {params});
  }

  deleteJob(id: string): Observable<string> {
    const deleteUrl = `${this.jobUrl2}/${id}`;
    return this.http.delete<string>(deleteUrl);
  }

  insertJob(formValues) {
    return this.http.post(this.jobUrl,formValues);
  }


}
