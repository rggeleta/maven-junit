package model;

/**
 * @author roman - rggeleta CIS175 - Spring 2022 Jan 24, 2022
 */
public class Student {
	private static String studentName;
	private int studentId;
	private double studentGrade;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, int studentId, double studentGrade) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentGrade = studentGrade;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public double getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(double studentGrage) {
		this.studentGrade = studentGrage;
	}

	public String printStudentName() {
		return studentName;
	}

	public static int returnStudentNameLength() {

		return studentName.length();
	}

}
