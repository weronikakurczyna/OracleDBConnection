package pl.weronika.kurczyna.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.weronika.kurczyna.model.entity.JobGrade;


public interface JobGradeRepository extends JpaRepository<JobGrade, String> {
}
