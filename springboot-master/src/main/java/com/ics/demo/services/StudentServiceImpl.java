package com.ics.demo.services;

import com.ics.demo.NotFoundException;
import com.ics.demo.models.Student;
import com.ics.demo.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow(()-> new NotFoundException("No student found with id: "+id));
    }

    @Override
    public void delete(Long id) {
            studentRepository.deleteById(id);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student){
        Student found = findById(student.getId());

        found.setFirstName(student.getFirstName());
        found.setLastName(student.getLastName());
        found.setMiddleName(student.getMiddleName());
        found.setDob(student.getDob());

        return studentRepository.save(found);
    }
    @Override
    public Student update(Long id, Student student) {
        Student found = findById(id);

        found.setFirstName(student.getFirstName());
        found.setLastName(student.getLastName());
        found.setMiddleName(student.getMiddleName());
        found.setDob(student.getDob());
         return  studentRepository.save(found);

    }
}
