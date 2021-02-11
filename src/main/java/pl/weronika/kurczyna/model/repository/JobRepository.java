package pl.weronika.kurczyna.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.weronika.kurczyna.model.entity.Job;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, String> {

    List<Job> findAllByMaxSalaryGreaterThanAndJobTitleContains(Integer salary, String jobTitle);

}

