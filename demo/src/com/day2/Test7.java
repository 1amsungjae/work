package com.day2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		//세개의 수를 입력 받아서 작은수에서 큰수 순으로 출력(오름차순정렬)
		//세개의 수? 5 9 2
		//결과 :  2 5 9
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,temp;
		
		System.out.println("오름차순 정렬");
		
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		// 1번2번, 2번3번, 1번2번
		
		
		System.out.printf("결과 : %d %d %d\n",num1,num2,num3);
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);

	}

}
