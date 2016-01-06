package de.h_da.eit.fm.oop2.StudDB;

public class Student {
	public static final int minMatrikel = 100000;
	public static final int maxMatrikel = 999999;
	public static int  nextFreeMatrikel = minMatrikel;

	private int numMatrikel;
	private String firstName;
	private String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Student(String firstName, String name){
		this.numMatrikel = Student.nextFreeMatrikel;
		Student.nextFreeMatrikel += 1;
		this.firstName = firstName;
		this.name = name;
	}
	
	public int getNumMatrikel() {
		return this.numMatrikel;
	}
	public void setNumMatrikel(int numMatrikel) {
		this.numMatrikel = numMatrikel;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
