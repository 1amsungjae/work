//년,월,일
//2021년 12월 27일 월요일
//int d 받아서 요일이 보이게

package com.day4;

import java.util.Scanner;

public class Test2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		int y,m,days,i,d,week;
		
		do {
			System.out.println("년도?");
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.println("월?"); 
		    m = sc.nextInt();
		}while(m<1||m>12);
		
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}
		
		
		do {
			System.out.println("일?"); 
		    d = sc.nextInt();
		}while(d<1||d>months[m-1]);
		

		
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}
		
		days = (y-1)*365 + (y-1)/4-(y-1)/100+(y-1)/400;  

		for(i=0;i<m-1;i++) {
			days += months[i];
		}
		
		days += d;
		
		week = days % 7;
		
		String[] yoil = {"일","월","화","수","목","금","토"};
		
		System.out.printf("%d년%d월%d일%s요일",y,m,d,yoil[week]);
		//String 은 %s 로 문자를 표시한다

	}

}
