package com.ics.demo.services;

import com.ics.demo.models.Student;
import com.ics.demo.models.University;

import java.util.List;



public interface UniversityService {
    List<University> findAll();

    University findById(Long id);

    void delete(Long id);

    University createUniversity(University university);

    University update(University university);

    University update(Long id, University university);

    Student createStudent(Long id, Student student);
}
//student to have -> first name(mandatory), last name(mandatory), middle name(optional), dob(optional)