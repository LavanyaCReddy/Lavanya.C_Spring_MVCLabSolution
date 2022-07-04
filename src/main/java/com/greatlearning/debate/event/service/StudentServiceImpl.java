package com.greatlearning.debate.event.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.greatlearning.debate.event.dao.IStudentDao;
import com.greatlearning.debate.event.entity.Student;


import jakarta.transaction.Transactional;


@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
	
@Autowired
	private IStudentDao studentDao;

	public Student add(Student student) {
		
		return studentDao.insertStudentsDetails(student);
	}

	public Student update(Student student) {
		
		return studentDao.updateStudentsDetails(student);
	}

	public Student getStudent(int studentId) {
	
		return studentDao.findStudent(studentId);
	}


	public boolean deleteStudent(int studentId) {

		return studentDao.deleteStudentsDetails(studentId);
	}


	public List<Student> getAllStudents() {
		
		return studentDao.retrieveStudentsDetails();
	}

}
