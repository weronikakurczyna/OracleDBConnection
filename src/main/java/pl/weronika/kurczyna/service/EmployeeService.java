package pl.weronika.kurczyna.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.weronika.kurczyna.model.dto.EmployeeDto;
import pl.weronika.kurczyna.model.entity.Employee;
import pl.weronika.kurczyna.model.repository.EmployeeRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<EmployeeDto> getEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees
                .stream()
                .map(employee -> convertToDto(employee))
                .collect(Collectors.toList());
    }

    public EmployeeDto getEmployeeByEmployeeID(String employeeID) {
        return convertToDto(employeeRepository.findById(employeeID).get());
    }

    private EmployeeDto convertToDto(Employee employee) {
        return modelMapper.map(employee, EmployeeDto.class);
    }

}

