//두수를 입력 받아 적은 수에서 큰수까지의 합

package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		char oper;
		
		System.out.print("첫번째 수");
		num1 = sc.nextInt();
		System.out.println("두번째 수");
		num2 = sc.nextInt();
		
		System.out.println("골라[+,-,*,/]");
		oper = (char)System.in.read();
		
		switch(oper) {
		}
		if(oper == '+') {
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1+num2));
		}
		

	
	}
}
	



