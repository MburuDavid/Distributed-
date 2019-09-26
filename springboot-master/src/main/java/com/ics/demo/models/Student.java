package com.ics.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @NotNull(groups = Student.Update.class)
    @Column(name="id")
    private Long id;

    @NotNull(groups = Student.Create.class)
    @Column(name="first_name")
    private String firstName;

    @NotNull(groups = Student.Create.class)
    @Column(name="last_name")
    private String lastName;

    @Column(name="middle_name")
    private String middleName;

    @Column(name="dob")
    private String dob;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="university_id")
    private University university;

    @ManyToMany(mappedBy = "students")
    private Set<Course> courses = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public Student(){}

    public Student(String firstName, String lastName, String middleName, String dob, University university){

        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dob = dob;
        this.university = university;
    }

    public interface Create{}
    public interface Update{}

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dob='" + dob + '\'' +
                ", university=" + university +
                ", courses=" + courses +
                '}';
    }
}
