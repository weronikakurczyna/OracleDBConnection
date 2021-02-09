
export interface JobGradeInterface {
  gradeLevel: string;
  lowestSal: number;
  highestSal: number;
}

export class JobGrade {
  constructor(fields: Partial<JobGradeInterface>) {
    this.gradeLevel = fields.gradeLevel;
    this.lowestSal = fields.lowestSal;
    this.highestSal = fields.highestSal
  }
  gradeLevel: string;
  lowestSal: number;
  highestSal: number;

}
