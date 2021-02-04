import { Component, OnInit } from '@angular/core';
import {Location} from "../locations/location";
import {LocationsService} from "../../services/locations.service";
import {JobsService} from "../../services/jobs.service";
import {Job} from "./job";

@Component({
  selector: 'app-jobs',
  templateUrl: './jobs.component.html',
  styleUrls: ['./jobs.component.scss']
})
export class JobsComponent implements OnInit {

  private jobs: Job[];

  constructor(private jobsService: JobsService) {
  }

  ngOnInit(): void {
    this.showInfo();
  }

  private showInfo() {
    this.jobsService
      .getJobs()
      .subscribe((data: Job[]) => this.jobs = data);
  }
}
