package pl.weronika.kurczyna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.weronika.kurczyna.model.dto.JobHistoryDto;
import pl.weronika.kurczyna.service.JobHistoryService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class JobHistoryController {
    @Autowired
    private JobHistoryService jobHistoryService;

    @GetMapping(path = "/job-history")
    public ResponseEntity<List<JobHistoryDto>> getJobHistory() {
        return new ResponseEntity<>(jobHistoryService.getJobHistory(), HttpStatus.OK);
    }

}
