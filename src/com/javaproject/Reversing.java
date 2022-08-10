package com.javaproject;

public class Reversing {
	public void main(String[]args) {
		int n = 456;
		int a,i = 0, j = 0;
		a = n;
		
		while (a>0) {
			i = a % 10; // i = 6;i = 5 ; i = 4
			j = (j*10) + i; // j = 6; j =  65; j = 654 
			a = a / 10;  // a = 45 ; a = 4 ; a = 0
		}
		if(n==j) {
			System.out.println("Palidrome number:"+j);	
		}else {
			System.out.println("Not a Palindrome number:" +j);
		}
		
	}

}
