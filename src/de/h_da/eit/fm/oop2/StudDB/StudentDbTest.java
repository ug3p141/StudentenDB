package de.h_da.eit.fm.oop2.StudDB;

public class StudentDbTest {

	public static void main(String[] args) {
		StudentDb studDb = new StudentDb();
		for(int j = 0; j < 3; j++) {
			try {
				Student stud = new Student("First" + j, "Last" + j);
				studDb.addStudent(stud);
			}
			catch (Exception e) {
			}
		}
		studDb.print();

	}

}
