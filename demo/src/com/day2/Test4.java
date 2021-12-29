package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {
		
		//제어문,반복문
		//if, for, while, do~while, switch
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int su;
		String str;
		
		System.out.println("수입력?");
		su = Integer.parseInt(br.readLine());
		
//        if조건  if문
//		if(su%2 == 0) {
//			str = "짝수";
//		}
//		
//		if(su%2 != 0) {    // !=는 같지 않다는 뜻
//			str = "홀수";
//		}
		
		
		
		
//		if else문
		if(su%2 == 0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		//나머지가 0이면 짝수로 끝, 0이 아니면 else 로 넘어가 홀수가 나온다.
		
		System.out.println(su + ":" + str);

	}

}
