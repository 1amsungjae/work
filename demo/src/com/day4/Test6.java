package com.day4;

import java.util.Scanner;

public class Test6 {

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
		
		System.out.print("�̸�?");
		name[0] = sc.next();
		System.out.println("����?");
		score[0] = sc.nextInt();
		
		System.out.println("�̸�?");
		name[1] = sc.next();
		System.out.println("����?");
		score[1] = sc.nextInt();
		
		System.out.println("�̸�?");
		name[2] = sc.next();
		System.out.println("����");
		score[2] = sc.nextInt();
		
		
		
		

	}

}