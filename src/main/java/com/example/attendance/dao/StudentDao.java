package com.example.attendance.dao;

import com.example.attendance.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 插入学生
     * @return 影响的行数
     */
    public int insert(Student student) {
        String sql = "INSERT INTO student (student_id, name, class_name) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql,
                student.getStudentId(),   // 改成 studentId
                student.getName(),
                student.getClassName()
        );
    }
    public Student findByStudentId(String studentId) {
        String sql = "SELECT student_id, name, class_name FROM student WHERE student_id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> {
                Student student = new Student();
                student.setStudentId(rs.getString("student_id"));
                student.setName(rs.getString("name"));
                student.setClassName(rs.getString("class_name"));
                return student;
            }, studentId);
        } catch (Exception e) {
            return null;
        }
    }
}