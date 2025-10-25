package com.petProfect.userPetProject.repository;

import com.petProfect.userPetProject.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryEmployeeDAO {
    private final List<Employee> EMPLOYEES = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        return EMPLOYEES;
    }

    public Employee createEmployee(Employee employee) {
        EMPLOYEES.add(employee);
        return employee;
    }

    public Employee findByNumber(String phoneNumber) {
        return EMPLOYEES.stream()
                .filter(employee -> employee.getPhoneNumber().equals(phoneNumber))
                .findFirst()
                .orElse(null);
    }

    public Employee updateEmployee(Employee employee) {
        var userIndex = IntStream.range(0, EMPLOYEES.size())
                .filter(index -> EMPLOYEES.get(index).getPhoneNumber().equals(employee.getPhoneNumber()))
                .findFirst()
                .orElse(-1);
        if (userIndex > -1) {
            EMPLOYEES.set(userIndex, employee);
            return employee;
        }
        return null;
    }

    public void deleteEmployee(String phoneNumber) {
        var employee = findByNumber(phoneNumber);
        if (employee != null) {
            EMPLOYEES.remove(employee);
        }

    }
}
