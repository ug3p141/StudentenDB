package de.h_da.eit.fm.oop2.StudDB;


public class TestAll {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			try {
				Student myStudent = new Student((Student.minMatrikel + i) + "; " +  "some" + i + "; " + "one" + i + ";");
				myStudent.print();
			} catch (StudentException e){
				System.out.println("Couldn't create new Student");
			}
		}

	}

}
