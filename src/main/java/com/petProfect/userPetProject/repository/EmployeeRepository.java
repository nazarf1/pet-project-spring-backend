package com.petProfect.userPetProject.repository;

import com.petProfect.userPetProject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteByPhoneNumber(String phoneNumber);

    Employee findByPhoneNumber(String phoneNumber);
}
