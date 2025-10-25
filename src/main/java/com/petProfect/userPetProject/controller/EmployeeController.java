package com.petProfect.userPetProject.controller;

import com.petProfect.userPetProject.model.Employee;
import com.petProfect.userPetProject.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @PostMapping("create_employee")
    public Employee createUser(@RequestBody Employee employee) {
        return service.createEmployee(employee);
    }

    @GetMapping("/{phoneNumber}")
    public Employee findByNumber(@PathVariable String phoneNumber) {
        return service.findByNumber(phoneNumber);
    }

    @PutMapping("update_employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return service.updateEmployee(employee);
    }

    @DeleteMapping("delete_employee/{phoneNumber}")
    public void deleteEmployee(@PathVariable String phoneNumber) {
        service.deleteEmployee(phoneNumber);
    }
}
