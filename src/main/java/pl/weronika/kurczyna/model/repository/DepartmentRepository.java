package pl.weronika.kurczyna.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.weronika.kurczyna.model.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, String> {
}


