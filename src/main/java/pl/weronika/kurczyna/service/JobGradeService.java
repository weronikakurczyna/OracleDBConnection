package pl.weronika.kurczyna.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.weronika.kurczyna.model.dto.JobGradeDto;
import pl.weronika.kurczyna.model.entity.JobGrade;
import pl.weronika.kurczyna.model.repository.JobGradeRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobGradeService {
    @Autowired
    private JobGradeRepository jobGradeRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<JobGradeDto> getJobGrades() {
        List<JobGrade> jobGrades = jobGradeRepository.findAll();
        return jobGrades
                .stream()
                .map(jobGrade -> convertToDto(jobGrade))
                .collect(Collectors.toList());
    }

    public JobGradeDto getJobGradeByJobGradeId(String gradeLevel) {
        return convertToDto(jobGradeRepository.findById(gradeLevel).get());
    }

    private JobGradeDto convertToDto(JobGrade jobGrade) {
        return modelMapper.map(jobGrade, JobGradeDto.class);
    }

    public JobGradeDto createJobGrade(JobGradeDto jobGradeDto) {
        JobGrade newJobGrade = new JobGrade();
        newJobGrade.setGradeLevel(jobGradeDto.getGradeLevel());
        newJobGrade.setLowestSal(jobGradeDto.getLowestSal());
        newJobGrade.setHighestSal(jobGradeDto.getHighestSal());
        JobGrade savedJobGrade = jobGradeRepository.save(newJobGrade);

        return convertToDto(savedJobGrade);
    }

    public void deleteJobGrade(String gradeLevel) {
        jobGradeRepository.deleteById(gradeLevel);
    }
}
