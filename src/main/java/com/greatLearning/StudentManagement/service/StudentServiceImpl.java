package com.greatLearning.StudentManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatLearning.StudentManagement.entity.Student;
import com.greatLearning.StudentManagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> fetchAllStudents() {
		
		// get all student details from the database
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public Student saveStudent(Student student) {
		
		// save student details
		return studentRepository.save(student);
	}

	@Override
	public Student findStudentById(int studentId) {
		
		// get student by id from database table
		return this.studentRepository.findById(studentId).get();
	}

	@Override
	public void deleteStudentById(int studentId) {
		
		// delete student by id from database table
		studentRepository.deleteById(studentId);
	}

}