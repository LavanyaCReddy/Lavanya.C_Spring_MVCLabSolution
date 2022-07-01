package com.greatlearning.debate.event.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.greatlearning.debate.event.entity.Student;



@Repository
public class StudentDaoImpl implements IStudentDao {
	
	

	private SessionFactory sessionFactory;
	
	private Session session;
	
	public StudentDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
	}

public Student insertStudentsDetails(Student student) {
		//Transaction txn = session.beginTransaction();
		session.save(student);
		System.out.println("student info saved." + student);
		//txn.commit();
		return student;
	}

	public Student updateStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteStudentDetails(int studentId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Student findStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> retrievalStudentDetails() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Student> retrieveStudentDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student insertStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return null;
	}


	//@Override
	//public List<Student> retrieveStudentDetails() {
		// TODO Auto-generated method stub
		//return null;
	//}

	
	
}
