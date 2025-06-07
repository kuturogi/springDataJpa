package com.bertugkuturoglu.services;

import com.bertugkuturoglu.entities.Student;

import java.util.List;

public interface IStudentService {

    public Student SaveStudent(Student student);

    public List<Student> GetAllStudents();

    public Student GetStudentByID(Integer id);

    public void deleteStudentByID(Integer id);

    public Student updateStudent(Integer id, Student updateStudent);
}
