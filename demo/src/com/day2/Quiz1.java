//?????? ?Է??Ͽ? ¦??,Ȧ???? ?????ؼ? ????.

package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz1 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1;
		
		System.out.println("Ȧ???ΰ? ¦???ΰ???");
		num1 =  Integer.parseInt(br.readLine());
		
		String str;
		str = num1%2 == 0?"¦??" : "Ȧ??";
		
		System.out.println(str);

	}

}
