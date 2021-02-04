package pl.weronika.kurczyna.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.weronika.kurczyna.model.dto.JobDto;
import pl.weronika.kurczyna.model.entity.Job;
import pl.weronika.kurczyna.model.repository.JobRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<JobDto> getJobs() {
        List<Job> jobs = jobRepository.findAll();
        return jobs
                .stream()
                .map(job -> convertToDto(job))
                .collect(Collectors.toList());
    }

    public JobDto getJobByJobId(String jobID) {
        return convertToDto(jobRepository.findById(jobID).get());
    }

    private JobDto convertToDto(Job job) {
        return modelMapper.map(job, JobDto.class);
    }

}
