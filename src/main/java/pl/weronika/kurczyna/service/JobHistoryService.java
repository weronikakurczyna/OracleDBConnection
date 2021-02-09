package pl.weronika.kurczyna.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.weronika.kurczyna.model.dto.JobHistoryDto;
import pl.weronika.kurczyna.model.entity.JobHistory;
import pl.weronika.kurczyna.model.repository.JobHistoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobHistoryService {
    @Autowired
    private JobHistoryRepository jobHistoryRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<JobHistoryDto> getJobHistory() {
        List<JobHistory> jobHistories = jobHistoryRepository.findAll();
        return jobHistories
                .stream()
                .map(jobHistory -> convertToDto(jobHistory))
                .collect(Collectors.toList());
    }

    private JobHistoryDto convertToDto(JobHistory jobHistory) {
        return modelMapper.map(jobHistory, JobHistoryDto.class);
    }

}
