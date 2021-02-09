import {Component, OnInit} from '@angular/core';
import {JobGrade} from "./job-grade";
import {JobGradesService} from "../../services/job-grades.service";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-job-grades',
  templateUrl: './job-grades.component.html',
  styleUrls: ['./job-grades.component.scss']
})
export class JobGradesComponent implements OnInit {

  jobGrades: JobGrade[];
  jobGradesForm = new FormGroup({
    gradeLevel: new FormControl(),
    lowestSal: new FormControl(),
    highestSal: new FormControl()
    }
  )

  constructor(private jobGradesService: JobGradesService) {
  }

  ngOnInit(): void {
    this.showInfo();
  }

  private showInfo() {
    this.jobGradesService
      .getJobGrades()
      .subscribe((data: JobGrade[]) => this.jobGrades = data);
  }

  onDelete(gradeLevel: string) {
    this.jobGradesService.deleteJobGrade(gradeLevel)
      .subscribe(() => {
        console.log(`Job grade with ID = ${gradeLevel} deleted`)
        this.showInfo()
      });
  }

  onInsert(): void {
    this.jobGradesService.insertJobGrade(this.jobGradesForm.value).subscribe(() => {
      console.log('Job grade added')
      this.showInfo()
    });
  }
}



