package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {

		//입력한 수까지의 합계를 구하기

		Scanner sc = new Scanner(System.in);

		int su,sum = 0;
		char ch; //ch는 choice


		while(true){  //무한루프

			do {
				System.out.println("원하는 수?"); 
				su = sc.nextInt();
			}while(su<1 || su>5000); //원하는 수의 반대만큼 정해줘야된다
			//조건을 넣을때 원하는 값의 false 값이 나오게 정해준다.

			sum = 0;
			
			for(int i = 1; i <= su; i++) 

				sum+=i;  //sum = sum + i;

			System.out.println("1~" + su + "까지의 합 : " + sum);

			System.out.println("계속할래?[Y/N]");//Y,y,N,n,a,u
			ch = (char)System.in.read();

			if(ch!='Y' && ch!='y') { //양쪽이 부정(!=)이면 oR(||) 아닌 and(&&) 를 쓴다
				System.out.println("시스템 종료"); // Y,y가 아닌 나머지는 다 종료해라
				break;  //while,do ~ while,for,switch,if ... 무한루프를 탈출	

			}

		}

	}

}
