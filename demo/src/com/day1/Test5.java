package com.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class Test5 {

	public static void main(String[] args) throws IOException {
		
		//����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor,eng,tot;
		
		//�Է�
		System.out.print("�̸�?");//
		name = br.readLine();
				
		System.out.print("����?");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("����?");
		eng = Integer.parseInt(br.readLine());
		
		//����
		tot = kor + eng;
		
		//���
		System.out.println("�̸�: " + name);
		System.out.println("����: " + kor + ", ����: " + eng);
		System.out.println("����: " + (kor + eng) + "��");
		

	}

}