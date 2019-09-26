package com.ics.demo.services;

import com.ics.demo.NotFoundException;
import com.ics.demo.models.Student;
import com.ics.demo.models.University;
import com.ics.demo.repositories.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversityServiceImpl implements UniversityService {
//field injectiion
//    @Autowired
//    UniversityRepository universityRepository;

// or


    private final UniversityRepository universityRepository;
    private final  StudentService studentService;

    public UniversityServiceImpl(UniversityRepository universityRepository, StudentService studentService) {
        this.universityRepository = universityRepository;
        this.studentService = studentService;
    }

    @Override
    public List<University> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public University findById(Long id) {
        return universityRepository.findById(id).orElseThrow(()
                -> new NotFoundException("No university with id:"+id));
    }

    @Override
    public void delete(Long id) {
        universityRepository.deleteById(id);
    }

    @Override
    public University createUniversity(University university) {
        return universityRepository.save(university);
    }

    @Override
    public University update(University university) {
        University found = findById(university.getId());

        found.setLocation(university.getLocation());
        found.setName(university.getName());
        found.setYearFounded(university.getYearFounded());

        return universityRepository.save(found);
    }
    @Override
    public University update(Long id, University university) {

        University found = findById(id);

        found.setLocation(university.getLocation());
        found.setName(university.getName());
        found.setYearFounded(university.getYearFounded());

        return universityRepository.save(found);
    }
    @Override
    public Student createStudent(Long id, Student student){
        University university = findById(id);

        student.setUniversity(university);
        return studentService.createStudent(student);
    }
}
