package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Student;

/**
 * @author roman - rggeleta
 * CIS175 - Spring 2022
 * Jan 24, 2022
 */
public class TestStudent {

	String studentName ="Roman";
	Student student = new Student(studentName, 0, 0);
	
	@Before
	public void setup() throws Exception{
		
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testMemoLength() {
		int studentNameLength = studentName.length();
		assertTrue(studentNameLength == Student.returnStudentNameLength());
	}
	@Test
	public void testMemoNotNull() {
		assertNotNull (student.printStudentName());
	}

}
