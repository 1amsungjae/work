package com.day5;

import java.util.Scanner;

public class Rect {
	
	int w,h;//instance���� (���� ����) ������ int�� ���� ��ΰ� ��밡��
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
						
		//int w,h; //���� ����(���ú���) int�� �ȿ��־ �ش�μ� ����� ��밡��
		System.out.print("����?"); //10
		w = sc.nextInt();
		
		System.out.print("����?");
		h = sc.nextInt();
		
		//input�� ������� �����Ѵ�.
		return; //�����ص���
				
	}
	
	public int area() {
		
		int result; 
		result = w * h; 
		
		return result;//result���� int�� �ٽ� �����ش�. 
	}
	
	public int length() {
		
		return (w + h) * 2;
		
	}
	
	public void print(int a,int l) {
		
		System.out.println("����?" + w);
		System.out.println("����?" + h);
		System.out.println("����?" + a);
		System.out.println("�ѷ�?" + l);
		
		
	}
	
	
	

}
