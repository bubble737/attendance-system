package com.example.attendance.entity;

public class Student {
    private String studentId;
    private String name;
    private String className;

    // 无参构造方法
    public Student() {
    }

    // Getter 和 Setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}