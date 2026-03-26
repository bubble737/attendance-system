package com.example.attendance.servive.impl;

import com.example.attendance.dao.StudentDao;
import com.example.attendance.entity.Student;
import com.example.attendance.servive.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public String createStudent(Student student) {
        // 业务校验
        if (student.getStudentId() == null || student.getStudentId().isEmpty()) {
            throw new RuntimeException("学号不能为空");
        }
        if (student.getName() == null || student.getName().isEmpty()) {
            throw new RuntimeException("姓名不能为空");
        }

        int result = studentDao.insert(student);
        return result > 0 ? "创建成功" : "创建失败";
    }

    @Override
    public Student getStudentById(String studentId) {
        if (studentId == null || studentId.isEmpty()) {
            throw new RuntimeException("学号不能为空");
        }
        return studentDao.findByStudentId(studentId);
    }
}
