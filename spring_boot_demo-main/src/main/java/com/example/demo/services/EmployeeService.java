package com.example.demo.services;

import com.example.demo.dto.EmployeeDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto deletEmployee(Integer id);

    EmployeeDto updateEmployee(EmployeeDto employeeDto, Integer id);

    EmployeeDto searchEmployee(Integer id);
}
