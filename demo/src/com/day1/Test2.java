package com.day1;

public class Test2 {
	
	public static void main(String[] args) {
		
//		���� ����
//		int : ����(�� -21�� ~ +21��, 0 ����)
		int a=10;
		int b=5;
		
		int c,d;//������ ���� �������
		
		System.out.println(a);//10
		System.out.println(b);//5
//		System.out.println(c); //������ ����
		
		c = a + b;
		System.out.println(c);//15
		
		d = a - b;
		System.out.println(d);//5
		
		System.out.println(a + "+" + b + "=" + c);
		System.out.println(a + "-" + b + "=" + d);
		System.out.print("\n");//println or print("\n")
		
		//format(���)
		System.out.printf("%d+%d=%d\n", a,b,c);
		System.out.printf("%d - %d = %d%n", a,b,d);
		
		
		
		

    }
}