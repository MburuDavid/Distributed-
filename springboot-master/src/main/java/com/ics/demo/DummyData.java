package com.ics.demo;

import com.ics.demo.models.Course;
import com.ics.demo.models.Student;
import com.ics.demo.models.University;
import com.ics.demo.repositories.CourseRepository;
import com.ics.demo.repositories.StudentRepository;
import com.ics.demo.repositories.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//FEIGNClient
//RestTemplate
@Component
public class DummyData implements CommandLineRunner {
    private final UniversityRepository universityRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;


    public DummyData(UniversityRepository universityRepository, StudentRepository studentRepository, CourseRepository courseRepository) {

        this.universityRepository = universityRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        University strath = new University("Strathmore", "Ole sangale");
        universityRepository.save(strath);

        University jkuat = new University("Jkuat", "Thika Road");
        universityRepository.save(jkuat);

        Student muinde = new Student("Muinde", "Geofrey", "Munguti", "12 August 1997", jkuat);
        studentRepository.save(muinde);

        Student muinde2 = new Student("Muinde", "Geofrey", "Munguti", "12 August 1997", jkuat);
        studentRepository.save(muinde2);

        Course course = courseRepository.save(
                new Course("Application Programming for the Internet"));

        Course course1 = new Course("Technological programming");
        Course savedCourse1 = courseRepository.save(course1);

        Course governance = new Course("Corporate Governance");
        governance.addStudent(muinde);
        courseRepository.save(governance);

        course.addStudent(muinde);
        courseRepository.save(course);

        savedCourse1.addStudent(muinde2);
        courseRepository.save(savedCourse1);


    }
}
