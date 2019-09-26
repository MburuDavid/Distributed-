package com.ics.demo;

import com.ics.demo.models.MockAppointment;
import com.ics.demo.models.MockLecturer;
import com.ics.demo.models.MockStudent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="mockclient", url = "http://10.51.15.93:1000")
public interface MockFeignClient {

    @RequestMapping(method = RequestMethod.POST, value = "students")
    MockStudent createStudent(@RequestBody MockStudent student);

    @RequestMapping(method = RequestMethod.GET, value = "students")
    MockStudent searchByName(@RequestParam(value = "studentNumber") String number);

    @RequestMapping(method = RequestMethod.GET, value="lecturers")
    List<MockLecturer> viewLecturers();

    @RequestMapping(method = RequestMethod.POST, value = "appointments")
    MockAppointment createAppointment(@RequestBody MockAppointment appointment);

    @RequestMapping(method = RequestMethod.PATCH, value = "appointments/{id}")
    MockAppointment confirmAppointment(@PathVariable(name = "id") Long id, @RequestParam(value = "studentId")Long studentId);





}
