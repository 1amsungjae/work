//두개의 정수를 입력 받고, 큰 숫자와 작은 숫자를 구분해서 출력(if문)

package com.day2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1,num2,temp;
		
		System.out.println("정수1");
		System.out.println("정수2");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1>num2) {
			temp=num1;
		    num1=num2;
		    num2=temp;
		}
		if(num2>num1) {
			temp=num1;
		    num1=num2;
		    num2=temp;
		}
		
		System.out.printf("큰수 %d",num1);
		System.out.printf("작은수 %d",num2);

	}

}
