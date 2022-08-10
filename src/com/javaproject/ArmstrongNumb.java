package com.javaproject;



public class ArmstrongNumb {
	public void main(String[]args) {
	
	int a = 0;

	
	
	for (int n=1; n<=1000;n++) {
		
		int b,i = 0, j = 0;
		b = n;
		
		while (b>0) {
		
		
		i = b%10;              
		j = j+ (i * i * i);   
		b = b /10;              
	}
		if(n ==j) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not a Armstrong Number");
		}
	
	}
}
}