package com.example.IntegrityViolationError.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "CustomerData")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID",unique = true,updatable = false)
    int id;
    @Column(name = "Name",nullable = false)
    @NotBlank(message = "Name Cannot Be Empty")
    @Pattern(regexp = "^[a-zA-Z]$",message = "Special Character not allowed in name")
    String name;
    @Column(name = "Phone No",unique = true,nullable = false)
    @NotEmpty(message = "Please Enter An Phone No!")
    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$",message = "Please Provide An Valid Phone No!")
    String phoneno;

    public Customer(int id, String name, String phoneno) {
        this.id = id;
        this.name = name;
        this.phoneno = phoneno;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}
