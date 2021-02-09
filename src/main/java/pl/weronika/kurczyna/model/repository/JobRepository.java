package pl.weronika.kurczyna.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.weronika.kurczyna.model.entity.Job;

public interface JobRepository extends JpaRepository<Job, String> {


}

