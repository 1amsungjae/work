package com.day3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		//반복문(for,while,do~while)

		Scanner sc = new Scanner(System.in);

		int dan;

		System.out.println("단 입력?");
		dan = sc.nextInt();

		for(int i = 1; i <= 9; i++) {  //시작값,최댓값,증가값을 정확히 알때
			System.out.println(dan + "*" + i + "=" + (dan * i));


		}


		System.out.println("-----------------------------");


		int j = 0;
		while(j<9) {  //DB저장공간에 있는 만큼 반복 ex) 회원가입자한테 쿠폰을 뿌릴때 가입자 수를 확인할때
			j++;
			System.out.println(dan + "*" + j + "=" + (dan * j));


		}
		System.out.println("-----------------------------");


		int k = 0;
		do {  //조건을 먼저 만족하는지 확인 할때 ex) 성인 사이트 우선적으로 나이를 확인할때

			k++;
			System.out.println(dan + "*" + k + "=" + (dan * k));

		}while(k<9);
	}

}
