package com.day3;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		//�ݺ���(for,while,do~while)

		Scanner sc = new Scanner(System.in);

		int dan;

		System.out.println("�� �Է�?");
		dan = sc.nextInt();

		for(int i = 1; i <= 9; i++) {  //���۰�,�ִ�,�������� ��Ȯ�� �˶�
			System.out.println(dan + "*" + i + "=" + (dan * i));


		}


		System.out.println("-----------------------------");


		int j = 0;
		while(j<9) {  //DB��������� �ִ� ��ŭ �ݺ� ex) ȸ������������ ������ �Ѹ��� ������ ���� Ȯ���Ҷ�
			j++;
			System.out.println(dan + "*" + j + "=" + (dan * j));


		}
		System.out.println("-----------------------------");


		int k = 0;
		do {  //������ ���� �����ϴ��� Ȯ�� �Ҷ� ex) ���� ����Ʈ �켱������ ���̸� Ȯ���Ҷ�

			k++;
			System.out.println(dan + "*" + k + "=" + (dan * k));

		}while(k<9);
	}

}
