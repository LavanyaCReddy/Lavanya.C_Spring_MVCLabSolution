package com.greatlearning.debate.event.dao;

import java.util.List;

import com.greatlearning.debate.event.entity.Student;

public interface IStudentDao {

	Student insertStudentsDetails(Student student);

	public Student updateStudentsDetails(Student student);

	public boolean deleteStudentsDetails(int studentId);

	public Student findStudent(int studentId);

	public List<Student> retrieveStudentsDetails();

	

}
