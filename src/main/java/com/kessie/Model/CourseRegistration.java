package com.kessie.Model;

import com.kessie.Model.Course;
import com.kessie.Model.Student;
import jakarta.persistence.*;

@Entity
public class CourseRegistration {
    @Id
    private int registrationId;
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;
    @JoinColumn(name = "courseId")
    @ManyToOne
    private Course course;

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
