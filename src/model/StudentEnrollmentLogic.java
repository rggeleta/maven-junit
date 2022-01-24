package model;

/**
 * @author roman - rggeleta
 * CIS175 - Spring 2022
 * Jan 24, 2022
 */
public class StudentEnrollmentLogic {
	private static final int Credite = 0;

	public boolean studentIsEnrolled(Student student) {
		int id = 0;
		if(id >= 900) {		
		return true;
		}else {
			return false;
		}
		
	}
	
	public double getScored( Student student) {
		double grade = 0;
		if(student.getStudentGrade() >=90) {
			grade = 'A';
		}else if(student.getStudentGrade() >=80){
			grade = 'B';
		}else if(student.getStudentGrade()  >=70) {
			grade ='C';
		}else if(student.getStudentGrade() >=60) {
			grade = 'D';
			}else grade= 'F';
		return grade;
	}

	public double studentCreditHours(Student student) {
		double GPA ;
		int creditHour = 0;
		int credits = 0;
		double credite = 0;
		GPA = (Credite * creditHour)/ credits;
		return  GPA;
	}
}

