package com.day2;

import java.util.Scanner;

public class Test7_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,temp;
		
		System.out.println("������������");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1>num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}
		if(num1>num3) {
			temp=num1;
			num1=num3;
			num3=temp;
		}
		if(num2>num3) {
			temp=num2;
			num2=num3;
			num3=temp;
		}
		// 1��2��, 1��3��, 2��3��
		
		System.out.printf("���: %d %d %d\n",num1,num2,num3);
			
	}

}