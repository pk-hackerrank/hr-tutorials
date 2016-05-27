package com.pktippa;

import java.util.*;
import java.lang.reflect.Method;

public class Generics {
	public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Generics.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
	// Defining Generic method with type T
	static <T> void printArray(T[] array){
		// Iterating over array of type T and printing elements
		for( T item: array){
			System.out.println(item);
		}
	}
	
}
