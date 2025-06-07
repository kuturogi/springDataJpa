package com.bertugkuturoglu.controller;

import com.bertugkuturoglu.entites.Student;

import java.util.List;

public interface IStudentController {

public Student saveStudent(Student student);

public List<Student> getAllStudents();

public Student getStudentById(Integer id);

public void deleteStudentById(Integer id);
}
