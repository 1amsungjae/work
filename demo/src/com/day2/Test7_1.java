package com.day2;

import java.util.Scanner;

public class Test7_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,temp;
		
		System.out.println("오름차순으로");
		
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
		// 1번2번, 1번3번, 2번3번
		
		System.out.printf("결과: %d %d %d\n",num1,num2,num3);
			
	}

}
