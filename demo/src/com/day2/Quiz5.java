//�ܰ� 15800��¥�� ���� ���� �̻� ���Ž� ������ ���ش�.
//10���̻� 10%  20���̻� 15%  30���̻� 20% �Ǹ� �ݾ��� ����غ���. ex) 15�� 213300��
package com.day2;

import java.util.Scanner;

public class Quiz5{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int cnt, qty=15800;
	double sum=0;

	System.out.print("���� ������ �Է��ϼ��� : ");

	cnt = sc.nextInt();

	if(cnt >=30)
		sum=cnt*qty*0.8;
	else if(cnt >=20)
		sum=cnt*qty*0.85;
	else if(cnt >=10)
		sum=cnt*qty*0.9;
	else
		sum=cnt*qty;

	System.out.println("���Լ��� : " + cnt + "��, �Ǹ��ѱݾ� : " + sum +"��");

	}
}