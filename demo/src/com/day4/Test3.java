package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		//Selection Sort 
		//���ϴ´�� ù��°�� ����
		
		int[] num = new int[5]; //�迭 [5] 5���� �� �ڸ��� �������
		int i,j,temp;
		
		System.out.print("���ڴ�?");
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		
		System.out.print("Source Data : ");
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		
		//Selection Sort
		//�ϱ�
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
				
		//Ȯ��for�� (�迭 ����)
		System.out.print("Sorted Data : ");
		for(int k : num) {
			System.out.printf("%4d",k);
		}
		System.out.println();
		
		
		

	}

}