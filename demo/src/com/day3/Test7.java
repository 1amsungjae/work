package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Test7 {

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

		//%c 는 oper를 받아올때 계산을 받아올때 c를 쓴다
		case '+':System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1+num2));
		break;

		case '-':System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1-num2));
		break;

		case '*':System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1*num2));
		break;

		case '/':System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1/num2));
		break;

		}

		if(oper == '+') {
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1+num2));
		}
		else if(oper == '-') {
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1-num2));
		}
		else if(oper == '*') {
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1*num2));
		}
		else if(oper == '/') {
			System.out.printf("%d%c%d=%d\n",num1,oper,num2,(num1/num2));
		}

	}



}


