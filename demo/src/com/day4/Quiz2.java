//1~10사이의 난수를 발생시켜 발생시킨 난수를 3번안에 맞추는 게임
//3번안에 맞추지 못하면 정답을 공개

package com.day4;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) throws IOException {
		
		

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int n,m,cnt=0;
		char ch;

		while(true){

			n = rd.nextInt(10)+1;	//컴퓨터 입력값			

			//System.out.print(n);	//검증용
			do{
				System.out.print("정수입력?[" + (cnt+1) + "번째기회] : ");

				m = sc.nextInt(); //사용자 입력값
				
				if(n==m){
				System.out.println("맞았어요!!");
				break;
				}

				System.out.println("틀렸어요!!");
				cnt++;

			}while(cnt<3);

			System.out.println();
			System.out.printf("정답은 %d입니다",n);
			System.out.println();
			System.out.println();
			
			cnt=0;	//횟수 초기화
			
			//계속 진행할지의 여부
			System.out.print("계속할래?[Y/N] : ");
			
			ch = (char)System.in.read();
			
			if(ch != 'Y' && ch != 'y')
				break;
			
		
	}
}
}