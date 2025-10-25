package com.petProfect.userPetProject.service.impl;

import com.petProfect.userPetProject.model.Employee;
import com.petProfect.userPetProject.repository.InMemoryEmployeeDAO;
import com.petProfect.userPetProject.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryEmployeeServiceImpl implements EmployeeService {
    private final InMemoryEmployeeDAO repository;

    @Override
    public List<Employee> getAllEmployees() {
        return repository.getAllEmployees();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return repository.createEmployee(employee);
    }

    @Override
    public Employee findByNumber(String phoneNumber) {
        return repository.findByNumber(phoneNumber);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return repository.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(String phoneNumber) {
        repository.deleteEmployee(phoneNumber);
    }
}
