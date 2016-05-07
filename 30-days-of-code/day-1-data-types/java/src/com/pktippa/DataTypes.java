package com.pktippa;

import java.util.*;

public class DataTypes {

	public static void main(String[] args) {
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        // Reading line and trimming and parsing to integer value
        int i1 = Integer.parseInt(scan.nextLine().trim());
        // Reading line and trimming and parsing to Double value
        double d1 = Double.parseDouble(scan.nextLine().trim());
        // Reading line as String and assigning to new variable
        String s1 = scan.nextLine().trim();
        // Printing concatinated values
        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.println(s+s1);
        // Closing scan stream
        scan.close();
	}

}
