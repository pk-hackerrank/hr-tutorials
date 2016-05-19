package com.pktippa;

import java.util.*;

public class AbstractClasses {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      String title=sc.nextLine();
	      String author=sc.nextLine();
	      int price=sc.nextInt();
	      Book new_novel=new MyBook(title,author,price);
	      new_novel.display();
	}
	static abstract class Book
	{
	    String title;
	    String author;
	    Book(String t,String a){
	        title=t;
	        author=a;
	    }
	    abstract void display();


	}
	static class MyBook extends Book{
		
		int price;
		MyBook(String t, String a, int price){
			super(t,a);
			this.price = price;
		}

		@Override
		void display() {
			System.out.println("Title: "+ this.title +"\nAuthor: "+ this.author + "\nPrice: "+ this.price);			
		}
		
	}
}
