package com.day2;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException{
		//char는 기호 int는 숫자
		//자료형 char
		char ch,result;
		
		System.out.print("한개의 문자");//a(아스키값 97)
		
		ch = (char)System.in.read();
		
		result = ch >= 65 && ch<=90? (char)(ch+32) : //아스키값 숫자로 입력해도 가능
			(ch>='a' && ch<='z'? (char)(ch-32):ch);  //' a ' 와 같이 ' ' 안에 문자를 써도 가능
		
		System.out.println(ch + ":" + result);
		
//		System.out.println(ch);
//		System.out.println(Integer.toString(ch));
		//Integer 와 Int 는 같다
		
//		char ch = 'ㅋ'; //char는 ' ' 안에 한글자만 가능
//		System.out.println(ch);
		// char ch = 'a'; a는 아스키값 97

	}

}
