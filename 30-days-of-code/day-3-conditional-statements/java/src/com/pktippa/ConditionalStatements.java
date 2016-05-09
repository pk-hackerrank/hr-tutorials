package com.pktippa;

import java.util.*;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Reading input from command line
		int n = scan.nextInt(); 
		// Closing scanner
		scan.close();
		// Initializing ans to empty
		String ans="";

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if(n%2==1){
			ans = "Weird";
		}
		else{
			// Conditions based on given data
			if((n>=2 && n<=5) || n>20){
				ans = "Not Weird";
			}
			// Conditions based on given data
			else if(n>=6 && n<=20){
				ans = "Weird";
			}
		}
		// Printing ans
		System.out.println(ans);
	}

}
