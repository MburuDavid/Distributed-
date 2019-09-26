package com.ics.demo.repositories;

import com.ics.demo.models.University;
import org.springframework.data.jpa.repository.JpaRepository;

//Read on Java Generics..
public interface UniversityRepository  extends JpaRepository<University, Long> {


}
