package com.day3;

public class Test3 {

	public static void main(String[] args) {

		int n,sum;

		//100가지의 합 결과
		sum = 0;
		for(n=1;n<=100;n++) {
			sum += n;
		}
		System.out.println("100가지의 합 결과 : " + sum);

		//홀수의 합 결과
		sum = 0;
		for(n=1;n<=100;n+=2) {
			sum += n;
		}
		System.out.println("홀수의 합 결과 : " + sum);
		//짝수의 합 결과
		sum = 0;
		for(n=2;n<=100;n+=2) {
			sum += n;
		}

		System.out.println("짝수의 합 결과 : " + sum);

		//3의배수의 합
		sum = 0;
		for(n=3;n<=100;n+=3) {
			sum +=n;
		}
		System.out.println("3의배수의 합 결과 : " + sum);

		//4의배수의 합
		sum = 0;
		for(n=4;n<=100;n+=4) {
			sum += n;
		}
		System.out.println("4의배수의 합 결과 : " + sum);


	}

}
