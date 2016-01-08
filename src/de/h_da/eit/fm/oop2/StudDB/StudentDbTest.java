package de.h_da.eit.fm.oop2.StudDB;

public class StudentDbTest {

	public static void main(String[] args) throws StudentException {
		StudentDb studDb = new StudentDb();
		int error = 0;
		try {
			for(int j = 0; j < 3; j++) {
				error = j+1;
				Student stud = new Student("First" + j, "Last" + j);
				studDb.addStudent(stud);
			} 
		}
		catch (MaximumNumberOfStudentsExceededException e) {
			
			System.out.println("Cannot insert student " + error + ".");
		}
		studDb.print();

	}

}
