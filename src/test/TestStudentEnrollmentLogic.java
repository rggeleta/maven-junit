package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Student;
import model.StudentEnrollmentLogic;

/**
 * @author roman - rggeleta
 * CIS175 - Spring 2022
 * Jan 24, 2022
 */
public class TestStudentEnrollmentLogic {

	Student student = new Student(" Roman" , 0 , 0);
	StudentEnrollmentLogic stuEnrLogic = new StudentEnrollmentLogic();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@Test
	public void testetScored() {
		student.setStudentGrade(70);
		double grade = stuEnrLogic.getScored(student);
		assertEquals('C', grade, 0.0);
	}

	
	@Test
	public void studentIsEnrolled() {
		student.setStudentId(801);
		assertFalse(stuEnrLogic.studentIsEnrolled(student));
		
	}
	

}
