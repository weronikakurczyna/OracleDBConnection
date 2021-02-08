
export interface JobInterface {
  jobID: string;
  jobTitle: string;
  minSalary: number;
  maxSalary: number;
}

export class Job {
  constructor(fields: Partial<JobInterface>) {
    this.jobID = fields.jobID;
    this.jobTitle = fields.jobTitle;
    this.minSalary = fields.minSalary;
    this.maxSalary = fields.maxSalary;
  }

  jobID: string;
  jobTitle: string;
  minSalary: number;
  maxSalary: number;



}
