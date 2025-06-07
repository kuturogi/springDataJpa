package com.bertugkuturoglu.controller.impl;

import com.bertugkuturoglu.entities.Student;
import com.bertugkuturoglu.services.IStudentService;
import com.bertugkuturoglu.controller.IStudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @GetMapping(path = "/list")
    @Override
    public List<Student> getAllStudents() {
        return studentService.GetAllStudents();
    }

    @GetMapping(path = "/list/{id}")
    @Override
    public Student getStudentById(@PathVariable(name = "id") Integer id) {
        return studentService.GetStudentByID(id);
    }

    @DeleteMapping(path = "/Delete/{id}")
    @Override
    public void deleteStudentById(@PathVariable(name = "id") Integer id) {
         studentService.deleteStudentByID(id);
    }

    @PutMapping(path = "/update/{id}")
    @Override
    public Student updateStudent(@PathVariable(name = "id") Integer id, @RequestBody Student updateStudent) {
        return studentService.updateStudent(id, updateStudent);
    }


}
