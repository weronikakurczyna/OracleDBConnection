package pl.weronika.kurczyna.model.repository;

import pl.weronika.kurczyna.model.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {}

