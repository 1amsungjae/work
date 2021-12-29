package com.day5;

import java.util.Scanner;

public class Rect {
	
	int w,h;//instance변수 (전역 변수) 복도로 int가 나와 모두가 사용가능
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
						
		//int w,h; //지역 변수(로컬변수) int가 안에있어서 해당부서 사람만 사용가능
		System.out.print("가로?"); //10
		w = sc.nextInt();
		
		System.out.print("세로?");
		h = sc.nextInt();
		
		//input은 여기까지 일을한다.
		return; //생략해도됨
				
	}
	
	public int area() {
		
		int result; 
		result = w * h; 
		
		return result;//result값을 int로 다시 돌려준다. 
	}
	
	public int length() {
		
		return (w + h) * 2;
		
	}
	
	public void print(int a,int l) {
		
		System.out.println("가로?" + w);
		System.out.println("세로?" + h);
		System.out.println("넓이?" + a);
		System.out.println("둘레?" + l);
		
		
	}
	
	
	

}
