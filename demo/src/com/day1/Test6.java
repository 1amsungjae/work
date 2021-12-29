package com.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Test6 {

	public static void main(String[] args) throws IOException {
		
		//선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int width,height,area;
		
		//입력
		System.out.print("밑변?");//
		width = Integer.parseInt(br.readLine());
				
		System.out.print("높이?");
		height = Integer.parseInt(br.readLine());

		
		//연산
		area = width * height / 2;
		
		//출력
		System.out.println("밑변: " + width + "cm");
		System.out.println("높이: " + height + "cm");
		System.out.println("넓이: " + area + "cm");
		

	}

}
