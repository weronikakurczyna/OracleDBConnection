package pl.weronika.kurczyna.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.weronika.kurczyna.model.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

    List<Employee> findAllByJobId(String Id);

    List<Employee> findAllBySalaryLessThanAndCommissionPCTEquals(Integer salary, Double commissionPCT);

}

