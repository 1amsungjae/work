//5���� ������ �Է¹޾� �Է¹��� ���� ����ϰ� 
//�Է¹��� �� �� ���� ū ���� ���� ����  ���

package com.day4;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {



		int[] su = new int[5];
		int i,max,min;

		Scanner sc = new Scanner(System.in);

		for(i=0;i<su.length;i++){

			System.out.print("����?[5��]");
			su[i] = sc.nextInt();
		}
	
		//max�� min���Ҷ� ���
		//���� �־���� �ٸ� ���� ��
		max=min=su[0];

		for(i=1;i<su.length;i++){
			if(max<su[i])
				max=su[i];
			if(min>su[i])
				min=su[i];
		}
			System.out.printf("���� ������ : %d, ���� ū�� %d",min,max);	
			System.out.println();	

	}
}

/*
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		int i,j,temp;

		System.out.print("���ڴ�?");
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		} 
		System.out.print("Source Data  : ");
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		// 5���� ������ �Է¹޾� ���


		for(i=0;i<num.length-1;i++) {

			for(j=i+1;j<num.length;j++) {

				//System.out.println(i + ":" + j);

				if(num[i]<num[j]) {

					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		//���ڸ� ��

		System.out.print("���� ū ��   : ");
		for(int k : num) {
			System.out.printf("%4d",k);
		}

		//���� ū��

		System.out.println();

		for(i=0;i<num.length-1;i++) {

			for(j=i+1;j<num.length;j++) {

				//System.out.println(i + ":" + j);

				if(num[i]>num[j]) {

					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		//���� ��
		System.out.print("���� ���� �� : ");
		for(int l : num) {
			System.out.printf("%4d",l);
		}
		//���� ���� ��


	}

}
 */