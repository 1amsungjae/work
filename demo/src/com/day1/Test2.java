package com.day1;

public class Test2 {
	
	public static void main(String[] args) {
		
//		변수 선언
//		int : 정수(약 -21억 ~ +21억, 0 포함)
		int a=10;
		int b=5;
		
		int c,d;//쓰레기 값이 들어있음
		
		System.out.println(a);//10
		System.out.println(b);//5
//		System.out.println(c); //컴파일 오류
		
		c = a + b;
		System.out.println(c);//15
		
		d = a - b;
		System.out.println(d);//5
		
		System.out.println(a + "+" + b + "=" + c);
		System.out.println(a + "-" + b + "=" + d);
		System.out.print("\n");//println or print("\n")
		
		//format(모양)
		System.out.printf("%d+%d=%d\n", a,b,c);
		System.out.printf("%d - %d = %d%n", a,b,d);
		
		
		
		

    }
}
