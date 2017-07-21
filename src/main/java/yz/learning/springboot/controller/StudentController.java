package yz.learning.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yz.learning.springboot.entity.Student;
import yz.learning.springboot.service.StudentService;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping("/list")
    public List<Student> getStus() {
        LOGGER.info("读取所有Student(s)");
        return studentService.getList();
    }
}
