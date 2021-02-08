import {Component, OnInit} from '@angular/core';
import {Location} from "../locations/location";
import {LocationsService} from "../../services/locations.service";
import {JobsService} from "../../services/jobs.service";
import {Job} from "./job";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-jobs',
  templateUrl: './jobs.component.html',
  styleUrls: ['./jobs.component.scss']
})
export class JobsComponent implements OnInit {

  jobs: Job[];

  jobForm = new FormGroup({
    jobID: new FormControl(),
    jobTitle: new FormControl(),
    minSalary: new FormControl(),
    maxSalary: new FormControl()
  });


  constructor(private jobsService: JobsService) {
  }

  ngOnInit(): void {
    setInterval(() => this.showInfo(), 150000);
    this.showInfo();
  }

  private showInfo() {
    this.jobsService
      .getJobs()
      .subscribe((data: Job[]) => this.jobs = data);
    this.jobForm.reset();
  }

  private onDelete(jobID: string) {
    this.jobsService.deleteJob(jobID)
      .subscribe(() => {
        console.log(`Job with ID = ${jobID} deleted`)
        this.showInfo()
      });
  }

  private onInsert(): void {
    //console.log('ID ' + this.jobForm.get('jobID').value)
    this.jobsService.insertJob(this.jobForm.value).subscribe(() => {
      console.log('Job added')
      this.showInfo()
    });
  }

  refresh(): void {
    window.location.reload();
  }
}
