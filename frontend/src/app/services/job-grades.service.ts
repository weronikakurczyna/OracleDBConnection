import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {JobGrade, JobGradeInterface} from "../components/job-grades/job-grade";

@Injectable({
  providedIn: 'root'
})
export class JobGradesService {

  private jobGradesUrl: string = "http://localhost:8080/api/job-grades";
  private jobGradesUrl2: string = "http://localhost:8080/api/job-grade";

  constructor(protected http: HttpClient) {
  }

  getJobGrades(): Observable<JobGrade[]> {
    return this.http
      .get<JobGradeInterface[]>(this.jobGradesUrl);
  }

  deleteJobGrade(id: string): Observable<string> {
    const deleteUrl = `${this.jobGradesUrl2}/${id}`;
    return this.http.delete<string>(deleteUrl);
  }

  insertJobGrade(formValues) {
    return this.http.post(this.jobGradesUrl,formValues);
  }
}
