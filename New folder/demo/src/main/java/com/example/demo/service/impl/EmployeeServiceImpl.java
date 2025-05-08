package com.example.demo.service.impl;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepo employeeRepo;

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employee) {

        Employee employeeDTO = new Employee();
        employeeDTO.setName(employee.getName());

        employeeRepo.save(employeeDTO);
        System.out.println(employeeDTO);
        return employee;

    }
}
