//1~3������ ������ �߻����� ����,����,�� ���� ������Ʈ �ۼ�

package com.day4;

import java.util.Random;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int su,com;
		String str;
		
		String[] a ={"����","����","��"};

		com = rd.nextInt(3);

		System.out.print("1:����, 2:����, 3:�� ?");

		su = sc.nextInt()-1;

	System.out.println("��ǻ�� :" + a[com] + " ��� :" + a[su]);

	if(com==su)
		str="�����ϴ�";
	else if((su+2)%3==com)	//���а���
		str="����� �̰���ϴ�";
	else
		str="��ǻ�Ͱ� �̰���ϴ�";

	System.out.println(str);

	}

}