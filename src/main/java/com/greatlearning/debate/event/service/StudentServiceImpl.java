package com.greatlearning.debate.event.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatlearning.debate.event.dao.IStudentDao;
import com.greatlearning.debate.event.entity.Student;


@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
@Autowired
	private IStudentDao studentDao;

	public Student add(Student student) {
		// TODO Auto-generated method stub
		return studentDao.insertStudentsDetails(student);
	}

	public Student update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		return false;
	}


	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
