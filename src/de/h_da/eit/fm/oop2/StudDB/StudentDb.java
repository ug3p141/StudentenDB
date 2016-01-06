package de.h_da.eit.fm.oop2.StudDB;

public class StudentDb {
	private Student[] students = new Student[10000];
	private int countStudents = 0;
	
	public void addStudent(Student student) {
		students[this.countStudents] = student;
		this.countStudents += 1;
	}
	
	public void print() {
		for (int i = 0; i < countStudents; i++) {
			students[i].print();
		}
	}

}
