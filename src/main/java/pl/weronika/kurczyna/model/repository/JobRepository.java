package pl.weronika.kurczyna.model.repository;

import pl.weronika.kurczyna.model.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, String> {

}

