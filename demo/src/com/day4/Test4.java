 package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		//10�� �̳��� �̸��� ������ �Է� �޾�
		//������ ���� ������� ���� ��� ������ ��� (���� ��������)

		Scanner sc = new Scanner(System.in);//��������� ���� ������ ��ĳ�� ���

		String[] neme;
		int[] score;

		int i,j,inwon,temp1; //  < ������ �� ū�� ,�������� �� ���� ��
		String temp2;

		do {
			System.out.print("�ο���?[1~10]");
			inwon = sc.nextInt();
		}while(inwon<1 || inwon>10);

		//�迭 �޸� �Ҵ�(��ü����)
		String[] name = new String[inwon];
		score = new int[inwon];

		for(i=0;i<inwon;i++) {
			System.out.print("�̸�?");
			name[i] = sc.next();
			System.out.println("����?");
			score[i] = sc.nextInt();

		}	
		


		// Selection Sort
		for(i=0;i<score.length-1;i++) {
			for(j=i+1;j<score.length;j++) {

				if(score[i]<score[j]) {

					temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;
					//���� score ũ��� �ڸ��ٲ�
					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
					//�̸� name �ڸ� �ٲ�
				}
			}
		}

		//���� ����
		for(i=0;i<inwon;i++) {
			System.out.printf("%6s %4d\n",name[i],score[i]);
		}
	}
}




