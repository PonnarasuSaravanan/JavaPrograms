package com.javaproject;

public class Fibonacci {
	public void main(String[]args) {
		
		int a = 0,b = 1;
		
		for(int i=2;i<=20;i++) {
			
			int c = a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
	}

}
