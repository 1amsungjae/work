package com.day3;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {

		//�Է��� �������� �հ踦 ���ϱ�

		Scanner sc = new Scanner(System.in);

		int su,sum = 0;
		char ch; //ch�� choice


		while(true){  //���ѷ���

			do {
				System.out.println("���ϴ� ��?"); 
				su = sc.nextInt();
			}while(su<1 || su>5000); //���ϴ� ���� �ݴ븸ŭ ������ߵȴ�
			//������ ������ ���ϴ� ���� false ���� ������ �����ش�.

			sum = 0;
			
			for(int i = 1; i <= su; i++) 

				sum+=i;  //sum = sum + i;

			System.out.println("1~" + su + "������ �� : " + sum);

			System.out.println("����ҷ�?[Y/N]");//Y,y,N,n,a,u
			ch = (char)System.in.read();

			if(ch!='Y' && ch!='y') { //������ ����(!=)�̸� oR(||) �ƴ� and(&&) �� ����
				System.out.println("�ý��� ����"); // Y,y�� �ƴ� �������� �� �����ض�
				break;  //while,do ~ while,for,switch,if ... ���ѷ����� Ż��	

			}

		}

	}

}