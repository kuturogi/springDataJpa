package com.bertugkuturoglu.controller.impl;

import com.bertugkuturoglu.entites.Student;
import com.bertugkuturoglu.services.IStudentService;
import com.bertugkuturoglu.controller.IStudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;

    //Dto kullanılır normalde

    @PostMapping(path = "/save")
    @Override
    public Student saveStudent( @RequestBody Student student) {

        return studentService.SaveStudent(student) ;
    }




}
