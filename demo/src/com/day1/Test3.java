package com.day1;

public class Test3 {

	public static void main(String[] args) {
		
		int r = 10; //정수
		float area,length; //실수(소숫점)
		
		area = r*r*3.14f;
		length = r*2*3.14f;
		
		System.out.println(area);
		System.out.println(length);
		
		System.out.println("반지름 : " + r + ", 면적 :  " + area);
		System.out.printf("반지름 : %d, 면적 : %.2f\n",r,area);
				
		
		int a = 5;
		float b;
		//같은 4바이트 지만 float이 int 보다 크다
		
		b = a;                   //암시적 형변환
		System.out.println(b);
		
		a = (int)b;             //강제 형변환
		System.out.println(a);
		                        //a = b; 오류
		
	}

}
