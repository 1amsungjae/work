//1~10������ ������ �߻����� �߻���Ų ������ 3���ȿ� ���ߴ� ����
//3���ȿ� ������ ���ϸ� ������ ����

package com.day4;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) throws IOException {
		
		

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int n,m,cnt=0;
		char ch;

		while(true){

			n = rd.nextInt(10)+1;	//��ǻ�� �Է°�			

			//System.out.print(n);	//������
			do{
				System.out.print("�����Է�?[" + (cnt+1) + "��°��ȸ] : ");

				m = sc.nextInt(); //����� �Է°�
				
				if(n==m){
				System.out.println("�¾Ҿ��!!");
				break;
				}

				System.out.println("Ʋ�Ⱦ��!!");
				cnt++;

			}while(cnt<3);

			System.out.println();
			System.out.printf("������ %d�Դϴ�",n);
			System.out.println();
			System.out.println();
			
			cnt=0;	//Ƚ�� �ʱ�ȭ
			
			//��� ���������� ����
			System.out.print("����ҷ�?[Y/N] : ");
			
			ch = (char)System.in.read();
			
			if(ch != 'Y' && ch != 'y')
				break;
			
		
	}
}
}