package com.example.demo.service;

import com.example.demo.dto.EmployeeDTO;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeService {
    EmployeeDTO saveEmployee(EmployeeDTO employee);
}
