package com.petProfect.userPetProject.service.impl;

import com.petProfect.userPetProject.model.Employee;
import com.petProfect.userPetProject.repository.EmployeeRepository;
import com.petProfect.userPetProject.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override public Employee findByNumber(String phoneNumber) {
        return employeeRepository.findByPhoneNumber(phoneNumber);
    }

    @Override public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Transactional
    @Override public void deleteEmployee(String phoneNumber) {
        employeeRepository.deleteByPhoneNumber(phoneNumber);
    }
}
