package com.day3;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		/*int i = 10;
		String str = "크리스마스";
		float j = 0; //0.0을 쓰면 에러 0.0f를 써야된다
		 */
		
		//배열
		int num[] = new int[5]; //int[] num = new int[5]; 둘다 같음
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("다섯개의 정수?");
		
		
		for(int i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
			
		}				
		/*num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		num[3] = sc.nextInt();
		num[4] = sc.nextInt();*/
		
		for(int i=0;i<num.length;i++) {
		System.out.println("num[" + i + "]:" + num[i]);

		}
		System.out.println("배열 갯수 : " + num.length); //num.length가 배열갯수를 가져온다.
		
		num[3] = 100;
		System.out.println("num[3]" + num[3]);
		
		int a = num[3] - 30;
		System.out.println("a:"+ a);
	}
	

}
