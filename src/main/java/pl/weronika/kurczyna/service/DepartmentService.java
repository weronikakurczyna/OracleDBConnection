package pl.weronika.kurczyna.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.weronika.kurczyna.model.dto.DepartmentDto;
import pl.weronika.kurczyna.model.entity.Department;
import pl.weronika.kurczyna.model.repository.DepartmentRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<DepartmentDto> getDepartments() {
        List<Department> departments = departmentRepository.findAll();
        return departments
                .stream()
                .map(department -> convertToDto(department))
                .collect(Collectors.toList());
    }

    public DepartmentDto getDepartmentByDepartmentId(String departmentID) {
        return convertToDto(departmentRepository.findById(departmentID).get());
    }

    private DepartmentDto convertToDto(Department department) {
        return modelMapper.map(department, DepartmentDto.class);
    }

}
