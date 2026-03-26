package com.example.attendance.controller;

import com.example.attendance.entity.Student;
import com.example.attendance.servive.StudentService;  // 注意：你的包名是 servive
import com.example.attendance.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;  // 注入 Service

    @PostMapping("/create")
    public Result<String> createStudent(@RequestBody Student student) {
        try {
            String result = studentService.createStudent(student);
            return Result.success(result);
        } catch (RuntimeException e) {
            return Result.error(e.getMessage());
        }
    }

    @GetMapping("/{studentId}")
    public Result<Student> getStudent(@PathVariable String studentId) {
        Student student = studentService.getStudentById(studentId);
        if (student != null) {
            return Result.success(student);
        } else {
            return Result.error("学生不存在");
        }
    }
}