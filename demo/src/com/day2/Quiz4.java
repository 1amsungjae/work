//�⵵�� �Է¹ް� �������� ������� ����

package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz4 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1;
		System.out.print(" �⵵��? ");
		num1 = Integer.parseInt(br.readLine());
		
		String str;
        str = num1%4 == 0 && num1%100 != 0 || num1%400 == 0?"����":"���"; 
		
		
		System.out.println(num1 + ":" + str);

	}

}