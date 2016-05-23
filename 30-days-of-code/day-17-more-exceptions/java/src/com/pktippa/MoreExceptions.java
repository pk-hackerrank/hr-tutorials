package com.pktippa;

import java.io.*;
import java.util.*;

public class MoreExceptions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
	}
}
class Calculator{

	public int power(int n, int p) throws Exception{
		if(n >= 0 && p >= 0){
			int val = 1;
			while(p-->0){
				val = val* n;
			}
			return val;
		}else{
			throw new Exception("n and p should be non-negative");
		}
	}
	
}
