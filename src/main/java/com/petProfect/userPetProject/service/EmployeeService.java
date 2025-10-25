package com.petProfect.userPetProject.service;

import com.petProfect.userPetProject.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee);

    Employee findByNumber(String phoneNumber);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(String phoneNumber);
}
