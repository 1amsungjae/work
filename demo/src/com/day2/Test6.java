package com.day2;

import java.util.Scanner;

//Scanner�� �ܶ����ڸ� �����ؼ� �����͸� �Է¹��� �� �ִ�.
//�⺻ �ܶ��� �����̴�.

public class Test6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng,mat;
		
//		System.out.println("�̸� ���� ���� ����? ");// sj 40 50 60
		System.out.println("�̸�,����,����,����? ");// sj,40,50,60
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); // ����ȭ ǥ����
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.println(name + " : " + (kor + eng + mat) + " ��");

	}

}