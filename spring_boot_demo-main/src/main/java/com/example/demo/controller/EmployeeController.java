package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto employee = employeeService.saveEmployee(employeeDto);

        if(employee != null){
            return new ResponseEntity<>(employee, HttpStatus.CREATED);
        }

        return new ResponseEntity<>(employee, HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> loadEmployees(){
        List<EmployeeDto> allEmployees = employeeService.getAllEmployees();
        return ResponseEntity.ok(allEmployees);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<EmployeeDto> deleteEmployee(@PathVariable Integer id){
        EmployeeDto deletedEmployee = employeeService.deletEmployee(id);
        return ResponseEntity.ok(deletedEmployee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> editEmployee(@RequestBody EmployeeDto employeeDto, @PathVariable Integer id){
        EmployeeDto updateEmployee = employeeService.updateEmployee(employeeDto, id);
        if(updateEmployee != null){
            return  new ResponseEntity<>(employeeDto, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(updateEmployee, HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Integer id){
        EmployeeDto searchEmployee= employeeService.searchEmployee(id);
        return ResponseEntity.ok(searchEmployee);
    }
}
