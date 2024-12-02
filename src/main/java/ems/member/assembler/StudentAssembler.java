package ems.member.assembler;

import ems.member.dao.StudentDao;
import ems.member.service.StudentService;

public class StudentAssembler {
	private StudentDao studentDao;
	private StudentService studentService;
	
	public StudentAssembler() {
		this.studentDao = new StudentDao();
		this.studentService = new StudentService(studentDao);
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
