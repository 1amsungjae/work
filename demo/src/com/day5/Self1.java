package com.day5;

import java.util.Scanner;

public class Self1 {
	
	int w,h;
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����?");
		w = sc.nextInt();
		
		System.out.println("����?");
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
		
		System.out.println("����?"+ w);
		System.out.println("����?"+ h);
		System.out.println("�ﰢ�� ����?"+ a);
		System.out.println("����� �ѷ�?"+ l);
		
	}

}