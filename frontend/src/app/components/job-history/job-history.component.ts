import { Component, OnInit } from '@angular/core';
import {JobHistory} from "./job-history";
import {JobHistoryService} from "../../services/job-history.service";

@Component({
  selector: 'app-job-history',
  templateUrl: './job-history.component.html',
  styleUrls: ['./job-history.component.scss']
})
export class JobHistoryComponent implements OnInit {

  jobHistory: JobHistory[];


  constructor(private jobHistoryService: JobHistoryService) {
  }

  ngOnInit(): void {
    this.showInfo();
  }

  private showInfo() {
    this.jobHistoryService
      .getJobHistory()
      .subscribe((data: JobHistory[]) => this.jobHistory = data);
  }

  //

}
