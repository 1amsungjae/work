package com.day2;

import java.util.Scanner;

//Scanner는 단락문자를 구분해서 데이터를 입력받을 수 있다.
//기본 단락은 공백이다.

public class Test6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor,eng,mat;
		
//		System.out.println("이름 국어 영어 수학? ");// sj 40 50 60
		System.out.println("이름,국어,영어,수학? ");// sj,40,50,60
		
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); // 정규화 표현식
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.println(name + " : " + (kor + eng + mat) + " 점");

	}

}
