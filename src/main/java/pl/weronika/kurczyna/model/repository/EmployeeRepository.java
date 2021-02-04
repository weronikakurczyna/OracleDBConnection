package pl.weronika.kurczyna.model.repository;

import pl.weronika.kurczyna.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {}

