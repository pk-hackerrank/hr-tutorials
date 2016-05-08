package com.pktippa;

import java.util.*;

public class Operators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        double tipPercent = scan.nextDouble(); // tip percentage
        double taxPercent = scan.nextDouble(); // tax percentage
        double mealTipPercent = mealCost * ( tipPercent/100);
        double mealTaxPercent = mealCost * (taxPercent/100);
        double totalMealCost = mealCost + mealTipPercent + mealTaxPercent;
        scan.close();
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(totalMealCost);
        System.out.println("The total meal cost is "+totalCost+ " dollars.");
	}

}
