package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		int num1,num2;
		char oper;

		System.out.print("ù��° ��");
		num1 = sc.nextInt();
		System.out.println("�ι�° ��");
		num2 = sc.nextInt();

		System.out.println("���[+,-,*,/]");
		oper = (char)System.in.read();

		switch(oper) {

		//%c �� oper�� �޾ƿö� ����� �޾ƿö� c�� ����
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

