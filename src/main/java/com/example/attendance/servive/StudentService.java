package com.example.attendance.servive;

import com.example.attendance.entity.Student;

public interface StudentService {
    // 学生新增方法
    String createStudent(Student student);

    Student getStudentById(String studentId);
}
