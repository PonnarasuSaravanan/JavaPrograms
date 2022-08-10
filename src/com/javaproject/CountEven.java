package com.javaproject;

public class CountEven {
	public void main(String[]args) {
		int count = 0;
		int ocount =0;
		for(int i=1;i<=20;i++) {
			
			if(i%2==0) {
				
				
		System.out.println("Even number:"+i);
		count++;
		
			}
			else {
				System.out.println("Odd number:"+i);
				count++;
			}
		}
	}

}
