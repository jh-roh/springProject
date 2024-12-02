package ems.member.service;

import java.util.Map;

import ems.member.Student;
import ems.member.dao.StudentDao;

public class StudentService {
	
	private StudentDao studentDao;
	public StudentService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void register(Student student) {
		
		String sNum = student.getsNum();
		if(!verify(sNum)) {
			studentDao.insert(student);
		} else {
			System.out.println("The student has already registered.");
		}
	}
	
	
	public Student select(String sNum) {
		if(verify(sNum)) {
			return studentDao.select(sNum);
		} else {
			System.out.println("Student information is not available.");
		}
		return null;
	}
	
	public void modify(Student student) {
		if(verify(student.getsNum())) {
			studentDao.update(student);
		} else {
			System.out.println("Student information is not available.");
		}
	}
	
	public void delete(Student student) {
		if(verify(student.getsNum())) {
			studentDao.delete(student.getsNum());
		} else {
			System.out.println("Student information is not available.");
		}
	}
	
	public Map<String, Student> allSelect() {
		return studentDao.getStudentDB();
	}
	
	
	public boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		
		return student != null ? true : false;
	}
	
	
	
	
}
