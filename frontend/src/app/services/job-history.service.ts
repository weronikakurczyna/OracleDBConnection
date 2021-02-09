import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {JobGrade, JobGradeInterface} from "../components/job-grades/job-grade";
import {JobHistory, JobHistoryInterface} from "../components/job-history/job-history";

@Injectable({
  providedIn: 'root'
})
export class JobHistoryService {

  private jobHistoryUrl: string = "http://localhost:8080/api/job-history";

  constructor(protected http: HttpClient) {
  }

  getJobHistory(): Observable<JobHistory[]> {
    return this.http
      .get<JobHistoryInterface[]>(this.jobHistoryUrl);
  }
}
