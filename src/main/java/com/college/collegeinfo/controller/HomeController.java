package com.college.collegeinfo.controller;

import com.college.collegeinfo.model.Student;
import com.college.collegeinfo.modelResponse.StudentResponse;
import com.college.collegeinfo.repositories.BillingRepo;
import com.college.collegeinfo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    BillingRepo billingRepo;

    @Autowired
    StudentRepo studentRepo;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody StudentResponse studentResponse){
        return studentRepo.save(studentResponse.getStudentResponseData());
    }

}
