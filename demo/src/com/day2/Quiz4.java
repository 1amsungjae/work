//년도를 입력받고 윤년인지 평년인지 구분

package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz4 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1;
		System.out.print(" 년도는? ");
		num1 = Integer.parseInt(br.readLine());
		
		String str;
        str = num1%4 == 0 && num1%100 != 0 || num1%400 == 0?"윤년":"평년"; 
		
		
		System.out.println(num1 + ":" + str);

	}

}
