//10�� �̳��� �̸��� ������ �Է¹޾� ���� ���ϱ�

package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score;
		int[] rank;

		int i,j,inwon,temp;

		do {
			System.out.println("�ο���[1~10]?");
			inwon = sc.nextInt();
		}while(inwon<1 || inwon>10); 
		//�ο����� ���� 1~10�����ϱ� ������ �ش�

		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		//�迭�� �޸� �Ҵ��� �Ѵ�.

		for(i=0;i<inwon;i++) {
			System.out.println((i+1) + "��° �̸���??");
			name[i] = sc.next();

			System.out.print("����?");
			score[i] = sc.nextInt();
			//�̸��� ������ ���� �޴´�	

		}
		for(i = 0;i<inwon;i++) {
			rank[i] = 1;
		}
		//���� �ʱ�ȭ

		for(i=0;i<inwon-1;i++) {
			for(j=i+1;j<inwon;j++) {

				if(score[i]>score[j]) {
					rank[j]++;
				}else if(score[i]<score[j]){
					rank[i]++;
				}
			}
			//���� ���

		}
		for(i=0;i<inwon;i++) {
			System.out.printf("%6s %4d %4d\n",name[i],score[i],rank[i]);
			//�̸� ���� ��ŷ�� ���
		}
	}		

}





