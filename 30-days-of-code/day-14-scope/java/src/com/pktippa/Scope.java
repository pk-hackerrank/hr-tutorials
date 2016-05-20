package com.pktippa;

import java.util.*;

public class Scope {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         int[] a = new int[N];
         for (int i = 0; i < N; i++) {
             a[i] = sc.nextInt();
         }

         Difference D = new Difference(a);

         D.computeDifference();

       	System.out.print(D.maximumDifference);
	}
	static class Difference {
	  	private int[] elements;
	  	public int maximumDifference;
	  	public Difference(int[] elements){
	  		this.elements = elements;
	  	}
	  	// Logic - algorithm
	  	// initialize maxdiff = 0
	  	// Check 1st num to 2nd num - set to temp - check temp to maxdiff - which ever is bigger - set maxdiff to that value
	  	// Repeat the above step till the end by comparing 1st num to all next numbers
	  	// Repeat the above step rest of the numbers
	  	public void computeDifference(){
	  		maximumDifference = 0;
	  		for(int i=0;i<elements.length-1;i++){
	  			for(int j=i+1;j<elements.length;j++){
	  				int temp = Math.abs(elements[i] - elements[j]);
	  				if(temp>maximumDifference){
	  					maximumDifference = temp;
	  				}
	  			}
	  		}
	  	}
	}

}
