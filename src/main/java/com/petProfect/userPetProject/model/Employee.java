package com.petProfect.userPetProject.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String phoneNumber;
    private String yearOfBirth;
}
