//단가 15800원짜리 일정 수량 이상 구매시 할인을 해준다.
//10개이상 10%  20개이상 15%  30개이상 20% 판매 금액을 계산해보자. ex) 15개 213300원
package com.day2;

import java.util.Scanner;

public class Quiz5{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int cnt, qty=15800;
	double sum=0;

	System.out.print("구입 수량을 입력하세요 : ");

	cnt = sc.nextInt();

	if(cnt >=30)
		sum=cnt*qty*0.8;
	else if(cnt >=20)
		sum=cnt*qty*0.85;
	else if(cnt >=10)
		sum=cnt*qty*0.9;
	else
		sum=cnt*qty;

	System.out.println("구입수량 : " + cnt + "개, 판매총금액 : " + sum +"원");

	}
}