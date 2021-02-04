package pl.weronika.kurczyna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.weronika.kurczyna.model.dto.EmployeeDto;
import pl.weronika.kurczyna.service.EmployeeService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees")
    public ResponseEntity<List<EmployeeDto>> getEmployees() {
        return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
    }


    @GetMapping(path = "/employee/{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable(value = "id") String employeeID) {
        return new ResponseEntity<>(employeeService.getEmployeeByEmployeeID(employeeID), HttpStatus.OK);

    }
}
