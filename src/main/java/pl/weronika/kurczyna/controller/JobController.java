package pl.weronika.kurczyna.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.weronika.kurczyna.model.dto.JobDto;
import pl.weronika.kurczyna.service.JobService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping(path = "/jobs")
    public ResponseEntity<List<JobDto>> getJobs() {
        return new ResponseEntity<>(jobService.getJobs(), HttpStatus.OK);
    }

    @GetMapping(path = "/job/{id}")
    public ResponseEntity<JobDto> getJob(@PathVariable(value = "id") String jobID) {
        return new ResponseEntity<>(jobService.getJobByJobId(jobID), HttpStatus.OK);

    }

    @DeleteMapping(path = "/job/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable(value = "id") String jobID) {
        jobService.deleteJob(jobID);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

