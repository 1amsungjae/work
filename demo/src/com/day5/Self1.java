package com.day5;

import java.util.Scanner;

public class Self1 {
	
	int w,h;
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로?");
		w = sc.nextInt();
		
		System.out.println("세로?");
		h = sc.nextInt();
		
		
	}
	
	public int area() {
		
		int result;
		result = (w * h)/2;
		
		return result;
	}
	
	public int length() {
		
		return (w + h) * 2;
	}
	
	public void print(int a,int l) {
		
		System.out.println("가로?"+ w);
		System.out.println("세로?"+ h);
		System.out.println("삼각형 넓이?"+ a);
		System.out.println("사격형 둘레?"+ l);
		
	}

}
