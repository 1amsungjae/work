package com.day5;

import java.util.Scanner;

public class Self2 {
	
	int a,b;
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����??");
		a = sc.nextInt();
		
		System.out.println("����??");
		b = sc.nextInt();
		
	}
	
	public int haha() {
		
		int hoho;
		hoho = (a + b);
		
		return hoho;
		
	}
	
	public int kiki() {
		
		return (a - b);
		
	}
	
	public void print(int h,int k) {
		
		System.out.println("����?"+ a);
		System.out.println("����?"+ b);
		System.out.println("����!"+ h);
		System.out.println("����!"+ k);
	}
	

}
