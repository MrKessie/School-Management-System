package com.kessie.Model;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    private int courseId;
    private String courseTitle;
    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;

    @OneToOne
    @JoinColumn(name = "teacherId")
    private Teacher teacher;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
