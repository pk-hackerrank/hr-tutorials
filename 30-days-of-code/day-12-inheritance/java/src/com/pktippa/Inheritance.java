package com.pktippa;

import java.util.*;

public class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
	static class Person {
		protected String firstName;
		protected String lastName;
		protected int idNumber;

		// Constructor
		Person(String firstName, String lastName, int identification){
			this.firstName = firstName;
			this.lastName = lastName;
			this.idNumber = identification;
		}

		// Print person data
		public void printPerson(){
			System.out.println(
					"Name: " + lastName + ", " + firstName 
					+ 	"\nID: " + idNumber); 
		}

	}
	static class Student extends Person{
		private int[] testScores;
		public Student(String firstName, String lastName, int identification, int[] testScores) {
			super(firstName,lastName,identification);
			this.testScores = testScores; 
		}
		public String calculate() {
			int sum = 0;
			String grade = "";
			for (int d : testScores) sum += d;
			double average = 1.0d * sum / testScores.length;
			if (isBetween(average, 90, 100)) {
				grade = "O";
			}
			else if (isBetween(average, 80, 90)) {
				grade = "E";
			} 
			else if(isBetween(average, 70, 80)){
				grade = "A";
			}
			else if(isBetween(average, 55, 70)){
				grade = "P";
			}
			else if(isBetween(average, 40, 55)){
				grade = "D";
			}
			else {
				grade = "T";
			}
			return grade;
		}
		public static boolean isBetween(double x, int lower, int upper) {
			return lower <= x && x <= upper;
		}
	}

}
