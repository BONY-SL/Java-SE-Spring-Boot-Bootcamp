package com.example.demo.services.impl;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.services.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeRepo employeeRepo;

    public ModelMapper modelMapper;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo, ModelMapper modelMapper) {
        this.employeeRepo = employeeRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee savedEmployee = employeeRepo.save(modelMapper.map(employeeDto, Employee.class));
        return  modelMapper.map(savedEmployee, EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees= employeeRepo.findAll();
        List<EmployeeDto> employeeDtos = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDtos.add(modelMapper.map(employee, EmployeeDto.class));
        }
        return employeeDtos;
    }

    @Override
    public EmployeeDto deletEmployee(Integer id) {
        Employee searchUser = employeeRepo.findById(id).get();
        employeeRepo.delete(searchUser);
        return modelMapper.map(searchUser, EmployeeDto.class);
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto, Integer id) {
        Employee updateEmployee =  employeeRepo.findById(id).get();

        updateEmployee.setName(employeeDto.getName());
        updateEmployee.setPhone(employeeDto.getPhone());
        updateEmployee.setEmail(employeeDto.getEmail());

        employeeRepo.save(updateEmployee);

        return modelMapper.map(updateEmployee, EmployeeDto.class);
    }

    @Override
    public EmployeeDto searchEmployee(Integer id) {
        Employee seachedEmployee =  employeeRepo.findById(id).get();
        return modelMapper.map(seachedEmployee, EmployeeDto.class);
    }
}
