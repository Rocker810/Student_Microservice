package com.StudentMicro.student_management_system.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(nullable = false)
    private String name;

@Column(nullable = false, unique = true)
    private String email;

private Integer age;
private String department;

public Student() {}

    public Student(String name, String email, Integer age, String department) {
    this.name = name;
    this.email = email;
    this.age = age;
    this.department = department;
    }

    public Long getId() {
    return id;
    }
    public void setId(Long id) {
    this.id = id;
    }
    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public String getEmail() {
    return email;
    }
    public void setEmail(String email) {
    this.email = email;
    }
    public Integer getAge() {
    return age;
    }
    public void setAge(Integer age) {
    this.age = age;
    }
    public String getDepartment() {
    return department;
    }
    public void setDepartment(String department) {
    this.department = department;
    }

}
