//1���� 100������ ���� 3�� ����� ����
//3�� ����� ���� : 33
//���� ���������� 0���� ������������ ������Ű�� i++

package com.day3;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		int n =0, cnt;
		
		cnt=0;
		while(n<100) {
			n++;
			if(n%3==0)
				cnt++;
		}
		System.out.println("3�� ����� ���� : "+cnt);

	}

}