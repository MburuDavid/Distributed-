package com.ics.demo;

import com.ics.demo.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class SampleClient implements CommandLineRunner {
    private final FeignRestClient feignRestClient;
    private final MockFeignClient mockFeignClient;



    private final String url = "http://10.51.10.111:9090";

    public SampleClient(FeignRestClient feignRestClient, MockFeignClient mockFeignClient) {
        this.feignRestClient = feignRestClient;
        this.mockFeignClient = mockFeignClient;
    }


    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

//        ResponseEntity<List<University>> response = restTemplate.exchange(
//                url + "/universities",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<University>>() {
//                }
//        );
//        List<University> universities = response.getBody();
//        System.out.println("Universities:" + universities.toString());
//
//
//        ResponseEntity<List<Student>> students = restTemplate.exchange(
//                url + "/universities",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<Student>>() {
//                }
//        );
//
//        List<Student> stude = students.getBody();
//        System.out.println("Students: " + stude.toString());
//
//        universities = feignRestClient.getAllUniversities();
//        System.out.println(("Feign Universities" + universities.toString()));
//
//        String byId = String.format(url + "/universities/%s", response.getBody().get(0).getId());
//        University university = restTemplate.getForObject(
//                byId,
//                University.class
//        );

//        String uri = url + "/universities/search?name=" + university.getName();
//        University seached = restTemplate.getForObject(
//                uri,
//                University.class
//        );

//        University createdUniversity = feignRestClient.createUniversity(new University("TUK", "Nairobi"));
//        System.out.println("Created University:" + createdUniversity.toString());
//
//        createdUniversity = feignRestClient.findUniversityById(createdUniversity.getId());
//        System.out.println("Created University: " + createdUniversity);
//
//        createdUniversity.setName("KU");
//        University updated = feignRestClient.updateUniversity(createdUniversity.getId(),createdUniversity);
//        System.out.println("Updated to:" + updated);

//        List<University> searched = feignRestClient.searchByName("KU");
//        System.out.println("Searched : "+searched);

//          MockStudent student = mockFeignClient.createStudent(new MockStudent("94231","Muinde"));
//          System.out.println(student);
//
//          MockStudent searchByName = mockFeignClient.searchByName(student.getStudentNumber());
//          System.out.println("Search returns"+searchByName);
//
//         List<MockLecturer> lecturers = mockFeignClient.viewLecturers();
//         System.out.println("Lecturers:"+lecturers);
//
//         MockAppointment mockAppointment = mockFeignClient.createAppointment(new MockAppointment(student.getId(), lecturers.get(0).getId()));
//         System.out.println("Created Appointment: "+ mockAppointment);
//
//         MockAppointment confirmappointment = mockFeignClient.confirmAppointment(mockAppointment.getId(), student.getId());
//         System.out.println("Appointment confirmed:"+confirmappointment);

        Student student= new Student(95050,"David");
        feignRestClient.createStudent(student);
        Matches matches=new Matches("MALE",95050);
        feignRestClient.createMatch(matches);
        feignRestClient.confirmMatch((long)6);
        feignRestClient.requestDate((long)6,(long)8);







    }
}
