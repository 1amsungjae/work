//4���� ������ �Է¹ް�,  ���� ū ���� ���� ���� ���� �����Ͽ� ���

package com.day2;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int num1,num2,num3,num4,temp;
		
		System.out.print("���ڴ�?");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
			
		if(num2>num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if(num3>num4) {
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
		
		if(num1>num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num1>num4) {
			temp = num1;
			num1 = num4;
			num4 = temp;
		}
		if(num2>num4) {
			temp = num2;
			num2 = num4;
			num4 = temp;
		}
		
		System.out.println("���� ū ���� :" + num4 + "���� ���� ���� :" + num1);

		} 

}