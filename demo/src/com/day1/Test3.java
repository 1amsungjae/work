package com.day1;

public class Test3 {

	public static void main(String[] args) {
		
		int r = 10; //����
		float area,length; //�Ǽ�(�Ҽ���)
		
		area = r*r*3.14f;
		length = r*2*3.14f;
		
		System.out.println(area);
		System.out.println(length);
		
		System.out.println("������ : " + r + ", ���� :  " + area);
		System.out.printf("������ : %d, ���� : %.2f\n",r,area);
				
		
		int a = 5;
		float b;
		//���� 4����Ʈ ���� float�� int ���� ũ��
		
		b = a;                   //�Ͻ��� ����ȯ
		System.out.println(b);
		
		a = (int)b;             //���� ����ȯ
		System.out.println(a);
		                        //a = b; ����
		
	}

}