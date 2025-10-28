package com.StudentMicro.student_management_system.repository;

import com.StudentMicro.student_management_system.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDepartment(String department);
    boolean existsByEmail(String email);
}