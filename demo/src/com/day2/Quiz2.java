//�ΰ��� ������ �Է� �ް�, ū ���ڿ� ���� ���ڸ� �����ؼ� ���(if��)

package com.day2;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1,num2,temp;
		
		System.out.println("����1");
		System.out.println("����2");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1>num2) {
			temp=num1;
		    num1=num2;
		    num2=temp;
		}
		if(num2>num1) {
			temp=num1;
		    num1=num2;
		    num2=temp;
		}
		
		System.out.printf("ū�� %d",num1);
		System.out.printf("������ %d",num2);

	}

}