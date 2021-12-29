//1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합

package com.day3;

public class Quiz1 {

	public static void main(String[] args) {

		int n,sum1,sum2;

		//홀수의 합 결과
		sum1 = 0;
		
		for(n=1;n<=100;n+=2) {
			sum1 += n;
		}
		
		System.out.println("홀수의 합 결과 : " + sum1);
		
		//짝수의 합 결과
		sum2 = 0;
		for(n=2;n<=100;n+=2) {
			sum2 += n;
		}
		
		System.out.println("짝수의 합 결과 : " + sum2);
		
		//전체의 합 결과
		
		System.out.println("전체의 합 결과 : " + (sum1 + sum2));

	}

}
