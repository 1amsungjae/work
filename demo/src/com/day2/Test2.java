package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException{
		//����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.in(1byte�� ����)
		//InputStreamReader�� 1byte�� 2byte�� �ٲٰ� BufferedReader ��������� ����
		
		int num1,num2;
		//�Է�
		System.out.print(" ù��° ��? ");//20
		num1 = Integer.parseInt(br.readLine());
		//readLine�� String��
		
		System.out.print(" �ι�° ��?");//5
		num2 = Integer.parseInt(br.readLine());
		
		//���,����
		System.out.printf(" %d + %d = %d\t",num1,num2,(num1+num2));
		System.out.printf(" %d - %d = %d\n",num1,num2,(num1-num2));
		System.out.printf(" %d * %d = %d\t",num1,num2,(num1*num2));
		System.out.printf(" %d / %d = %d\n",num1,num2,(num1/num2));
		System.out.printf(" %d %% %d = %d\t",num1,num2,(num1%num2));
		// %�� ������ /�� ���� ���Ѵ�
		
		System.out.println("num1>num2: " + (num1>num2));
		System.out.println("num1==num2: " + (num1==num2));
		//���ڿ� �ݵ�� ()�� �򰥸����ʰ� ǥ��
		//���ڸ� ��ȣ�� �ε�ȣ�� ���ϸ� true or false �� ���´�.
		
		String str;
		
		//���׿�����(����? true��:false��)
		str = num1%2 == 0?"¦��" : "Ȧ��";
		//num1�� ���ڸ� 2�� ���������� �������� 0�̸� ¦��,�������� 0�� �ƴϸ� Ȧ��
		//if ��� ª�� �ڵ��� �� �ִ�.
		
		str = num1>0?"���":(num1<0?"����":"zero");
		
		//A and(&&) B : A�� true�̰� B�� true
		//A or(||) B : A�� true�̰ų� B�� ture�̸� true. �Ѵ� true�̸� true. �Ѵ� false �̸� false
		str = num1%4 == 0 && num1%100 != 0 || num1%400 == 0?"����":"���"; 
		
		
		System.out.println(num1 + ":" + str);
		
		
		
		
		
		
		

	}

}
