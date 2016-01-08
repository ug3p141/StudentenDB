package de.h_da.eit.fm.oop2.StudDB;

public class StudentDb {
	private Student[] students = new Student[2];
	private int countStudents = 0;
	
	public void addStudent(Student student) throws MaximumNumberOfStudentsExceededException {
		if (countStudents >= students.length) {
			throw new MaximumNumberOfStudentsExceededException();
		}
		students[this.countStudents] = student;
		this.countStudents += 1;
	}
	
	public void print() {
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}

}
