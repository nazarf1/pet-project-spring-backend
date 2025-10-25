package com.petProfect.userPetProject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    private UUID id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String phoneNumber;
    private String yearOfBirth;
}
