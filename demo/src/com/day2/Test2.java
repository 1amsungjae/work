package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException{
		//서언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.in(1byte를 읽음)
		//InputStreamReader는 1byte를 2byte로 바꾸고 BufferedReader 저장공간에 보관
		
		int num1,num2;
		//입력
		System.out.print(" 첫번째 수? ");//20
		num1 = Integer.parseInt(br.readLine());
		//readLine는 String이
		
		System.out.print(" 두번째 수?");//5
		num2 = Integer.parseInt(br.readLine());
		
		//출력,연산
		System.out.printf(" %d + %d = %d\t",num1,num2,(num1+num2));
		System.out.printf(" %d - %d = %d\n",num1,num2,(num1-num2));
		System.out.printf(" %d * %d = %d\t",num1,num2,(num1*num2));
		System.out.printf(" %d / %d = %d\n",num1,num2,(num1/num2));
		System.out.printf(" %d %% %d = %d\t",num1,num2,(num1%num2));
		// %는 나머지 /는 몫을 구한다
		
		System.out.println("num1>num2: " + (num1>num2));
		System.out.println("num1==num2: " + (num1==num2));
		//숫자에 반드시 ()로 헷갈리지않게 표시
		//숫자를 부호나 부등호로 비교하면 true or false 로 나온다.
		
		String str;
		
		//삼항연산자(조건? true값:false값)
		str = num1%2 == 0?"짝수" : "홀수";
		//num1의 숫자를 2로 나누었을때 나머지가 0이면 짝수,나머지가 0이 아니면 홀수
		//if 대신 짧게 코딩할 수 있다.
		
		str = num1>0?"양수":(num1<0?"음수":"zero");
		
		//A and(&&) B : A도 true이고 B도 true
		//A or(||) B : A만 true이거나 B만 ture이면 true. 둘다 true이면 true. 둘다 false 이면 false
		str = num1%4 == 0 && num1%100 != 0 || num1%400 == 0?"윤년":"평년"; 
		
		
		System.out.println(num1 + ":" + str);
		
		
		
		
		
		
		

	}

}
