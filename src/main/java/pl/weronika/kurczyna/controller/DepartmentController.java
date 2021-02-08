package pl.weronika.kurczyna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.weronika.kurczyna.model.dto.DepartmentDto;
import pl.weronika.kurczyna.service.DepartmentService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping(path = "/departments")
    public ResponseEntity<List<DepartmentDto>> getDepartments() {
        return new ResponseEntity<>(departmentService.getDepartments(), HttpStatus.OK);
    }

    @GetMapping(path = "/department/{id}")
    public ResponseEntity<DepartmentDto> getDepartment(@PathVariable(value = "id") String departmentID) {
        return new ResponseEntity<>(departmentService.getDepartmentByDepartmentId(departmentID), HttpStatus.OK);

    }

    @PostMapping("/departments")
    public ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto) {
        return new ResponseEntity<>(departmentService.createDepartment(departmentDto), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/department/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable(value = "id") String departmentID) {
        departmentService.deleteDepartment(departmentID);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
