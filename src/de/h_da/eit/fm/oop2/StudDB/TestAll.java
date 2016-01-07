package de.h_da.eit.fm.oop2.StudDB;

public class TestAll {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			try {
				Student myStudent = new Student("some" + i, "one" + i);
				myStudent.print();
			} catch (Exception e){
				System.out.println("Couldn't create new Student");
			}
		}

	}

}
