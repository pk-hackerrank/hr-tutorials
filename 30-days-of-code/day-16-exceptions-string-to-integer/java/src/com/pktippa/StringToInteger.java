package com.pktippa;

import java.io.*;
import java.util.*;

public class StringToInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int val = 0;
        try{
        	val = Integer.parseInt(S);
        }catch(Exception e){
        	System.out.println("Bad String");
        	return;
        }
        System.out.println(val);
	}
}
