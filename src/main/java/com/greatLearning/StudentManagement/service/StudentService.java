package com.greatLearning.StudentManagement.service;

import java.util.List;

import com.greatLearning.StudentManagement.entity.Student;

public interface StudentService {

	public List<Student> fetchAllStudents();

	public Student saveStudent(Student student);

	public Student findStudentById(int studentId);

	public void deleteStudentById(int studentId);

}