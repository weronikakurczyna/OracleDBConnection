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
/*

    // /employee ? salaryMaxValue=8000  &commissionPCT=null
    @GetMapping(path = "/employee/salary-with-null-commission-pct/{salaryValue}")
    public ResponseEntity<List<EmployeeDto>> getEmployeesWithSalaryLowerThan(@PathVariable(value = "salaryValue") Integer salary, Integer commissionPCT) {
        return new ResponseEntity<>(employeeService.getEmployeeBySalaryLowerThanAndCommissionPCT(salary, commissionPCT), HttpStatus.OK);
    }

*/

    @GetMapping(path = "/employeeByParams")
    public ResponseEntity<List<EmployeeDto>> getEmployeesWithRequestParameters(
            @RequestParam(value = "maxSalary") Integer maxSalary,
            @RequestParam(value = "commissionPCT", required = false) Double commissionPCT
    ) {
        return new ResponseEntity<>(employeeService.getEmployeeBySalaryLowerThanAndCommissionPCT(maxSalary, commissionPCT), HttpStatus.OK);
    }

//    @PostMapping("/employees")
//    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
//        return new ResponseEntity<>(employeeService.createEmployee(employeeDto), HttpStatus.CREATED);
//    }

//    @DeleteMapping(path = "/employee/{id}")
//    public ResponseEntity<String> deleteEmployee(@PathVariable(value = "id") String employeeID) {
//        employeeService.deleteEmployee(employeeID);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}
