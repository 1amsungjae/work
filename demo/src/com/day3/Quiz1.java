//1���� 100���� ���� Ȧ���� ��, ¦���� ��, ��ü�� ��

package com.day3;

public class Quiz1 {

	public static void main(String[] args) {

		int n,sum1,sum2;

		//Ȧ���� �� ���
		sum1 = 0;
		
		for(n=1;n<=100;n+=2) {
			sum1 += n;
		}
		
		System.out.println("Ȧ���� �� ��� : " + sum1);
		
		//¦���� �� ���
		sum2 = 0;
		for(n=2;n<=100;n+=2) {
			sum2 += n;
		}
		
		System.out.println("¦���� �� ��� : " + sum2);
		
		//��ü�� �� ���
		
		System.out.println("��ü�� �� ��� : " + (sum1 + sum2));

	}

}
