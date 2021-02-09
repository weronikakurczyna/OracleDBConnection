package pl.weronika.kurczyna.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.weronika.kurczyna.model.entity.Employee;
import pl.weronika.kurczyna.model.entity.JobHistory;

public interface JobHistoryRepository extends JpaRepository<JobHistory, Employee> {
}
