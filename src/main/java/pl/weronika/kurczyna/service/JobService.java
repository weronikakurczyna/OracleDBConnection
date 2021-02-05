package pl.weronika.kurczyna.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.weronika.kurczyna.model.dto.JobDto;
import pl.weronika.kurczyna.model.entity.Employee;
import pl.weronika.kurczyna.model.entity.Job;
import pl.weronika.kurczyna.model.repository.EmployeeRepository;
import pl.weronika.kurczyna.model.repository.JobRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
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

    public void deleteJob(String jobID) {
        List<Employee> employeesTochangeJob = employeeRepository.findAllByJobId(jobID);
        Job defaultJob = jobRepository.findById("AD_PRES").orElseThrow();

        employeesTochangeJob.forEach(employee -> {
            employee.setJob(defaultJob);
            employeeRepository.save(employee);
        });

        jobRepository.deleteById(jobID);
    }

    private JobDto convertToDto(Job job) {
        return modelMapper.map(job, JobDto.class);
    }

}
