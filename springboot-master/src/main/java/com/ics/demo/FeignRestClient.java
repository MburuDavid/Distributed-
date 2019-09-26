package com.ics.demo;

import com.ics.demo.models.Matches;
import com.ics.demo.models.Student;
import com.ics.demo.models.University;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="client", url = "http://10.51.10.111:2200")
public interface FeignRestClient {
//    @RequestMapping(method = RequestMethod.GET, value = "universities")
//    List<University> getAllUniversities();
//
//    @RequestMapping(method = RequestMethod.GET, value = "universities/{id}")
//    University findUniversityById(@PathVariable(name = "id")Long id);
//
//    @RequestMapping(method = RequestMethod.POST, value = "universities")
//    University createUniversity(@RequestBody University university);
//
//    @RequestMapping(method =  RequestMethod.PATCH, value = "universities/{id}")
//    University updateUniversity(@PathVariable(name = "id")Long id, @RequestBody University university);
//
//    @RequestMapping(method = RequestMethod.GET, value = "universities/search")
//    List<University> searchByName(@RequestParam(value = "name") String name);
//    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student createStudent(@RequestBody Student student);
    @RequestMapping(method = RequestMethod.POST ,value= "matches")
    Matches createMatch(@RequestParam (name="gender")String gender, @RequestParam(name="studentId")Long studentId);
    @RequestMapping(method = RequestMethod.PATCH, value = "matches")
    Matches confirmMatch(@PathVariable("blindDateId")Long blindDateId);
    @RequestMapping(method = RequestMethod.PUT, value = "date")
    Matches requestDate(@PathVariable("blindDateId")Long blindDateId,@RequestParam(name="matchId")Long matchId,@RequestParam(name="studentId")Long studentId);

}
