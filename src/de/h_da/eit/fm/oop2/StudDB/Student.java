package de.h_da.eit.fm.oop2.StudDB;

import java.util.StringTokenizer;

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
	public Student(String firstName, String name) throws StudentException {
		if (Student.nextFreeMatrikel > Student.maxMatrikel)  {
			throw new StudentException("Matrikel Nummern erschöpft");
		}
		else {
			this.numMatrikel = Student.nextFreeMatrikel;
			Student.nextFreeMatrikel += 1;
			this.firstName = firstName;
			this.name = name;
		}
	}
	
	public Student(String matsemnachsemvorsem) throws StudentException {
		StringTokenizer st = new StringTokenizer(matsemnachsemvorsem, ";");
		int i = 0;
		String[] stlist = new String[3];
		
		while (st.hasMoreTokens()) {
			stlist[i++] = st.nextToken();
			if (i > 3) {
				throw new StudentException("Input String ist ungültig!");
			}
		}
		try {
			this.numMatrikel = Integer.parseInt(stlist[0].trim());
			this.name = stlist[1].trim();
			this.firstName = stlist[2].trim();
		} catch (NumberFormatException e) {
			throw new StudentException("Input Matrikelnummer ist ungültig!");
		}
		
		if (this.numMatrikel < Student.minMatrikel || this.numMatrikel > Student.maxMatrikel ) {
			throw new StudentException("Input Matrikelnummer ist außerhalb der gültigen Bereiche!");
		}
		
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
	
	public void print() {
		System.out.println(this.name + ", " + this.firstName + "(" + this.getNumMatrikel() + ")");
	}
}
