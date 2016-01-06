package de.h_da.eit.fm.oop2.StudDB;

public class TestAll {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Student myStudent = new Student("some" + i, "one" + i);
			System.out.println("Matrikelnummer = : " + myStudent.getNumMatrikel());
		}

	}

}
