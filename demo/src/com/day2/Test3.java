package com.day2;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException{
		//char�� ��ȣ int�� ����
		//�ڷ��� char
		char ch,result;
		
		System.out.print("�Ѱ��� ����");//a(�ƽ�Ű�� 97)
		
		ch = (char)System.in.read();
		
		result = ch >= 65 && ch<=90? (char)(ch+32) : //�ƽ�Ű�� ���ڷ� �Է��ص� ����
			(ch>='a' && ch<='z'? (char)(ch-32):ch);  //' a ' �� ���� ' ' �ȿ� ���ڸ� �ᵵ ����
		
		System.out.println(ch + ":" + result);
		
//		System.out.println(ch);
//		System.out.println(Integer.toString(ch));
		//Integer �� Int �� ����
		
//		char ch = '��'; //char�� ' ' �ȿ� �ѱ��ڸ� ����
//		System.out.println(ch);
		// char ch = 'a'; a�� �ƽ�Ű�� 97

	}

}
