import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JobGradesComponent } from './job-grades.component';

describe('JobGradesComponent', () => {
  let component: JobGradesComponent;
  let fixture: ComponentFixture<JobGradesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ JobGradesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(JobGradesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
