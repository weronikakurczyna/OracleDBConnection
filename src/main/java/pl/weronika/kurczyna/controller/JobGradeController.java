package pl.weronika.kurczyna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.weronika.kurczyna.model.dto.JobGradeDto;
import pl.weronika.kurczyna.service.JobGradeService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class JobGradeController {
    @Autowired
    private JobGradeService jobGradeService;

    @GetMapping(path = "/job-grades")
    public ResponseEntity<List<JobGradeDto>> getJobGrades() {
        return new ResponseEntity<>(jobGradeService.getJobGrades(), HttpStatus.OK);
    }

    @GetMapping(path = "/job-grade/{id}")
    public ResponseEntity<JobGradeDto> getJobGrade(@PathVariable(value = "id") String gradeLevel) {
        return new ResponseEntity<>(jobGradeService.getJobGradeByJobGradeId(gradeLevel), HttpStatus.OK);

    }

    @PostMapping("/job-grades")
    public ResponseEntity<JobGradeDto> createJobGrade(@RequestBody JobGradeDto jobGradeDto) {
        return new ResponseEntity<>(jobGradeService.createJobGrade(jobGradeDto), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/job-grade/{id}")
    public ResponseEntity<String> deleteJobGrade(@PathVariable(value = "id") String gradeLevel) {
        jobGradeService.deleteJobGrade(gradeLevel);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
