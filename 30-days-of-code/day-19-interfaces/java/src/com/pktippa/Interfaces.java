package com.pktippa;

import java.io.*;
import java.util.*;

public class Interfaces {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
  	AdvancedArithmetic myCalculator = new Calculator();
    int sum = myCalculator.divisorSum(n);
    System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
    System.out.println(sum);
	}
}
class Calculator implements AdvancedArithmetic{
	@Override
	public int divisorSum(int n){
		int sum = 1;
    if(n != 1) sum += n;
		for(int i = 2; i <= n / 2 ; i++){
			if(n%i == 0){
				sum += i;
			}
		}
		return sum;
	}
}
interface AdvancedArithmetic{
   int divisorSum(int n);
}
