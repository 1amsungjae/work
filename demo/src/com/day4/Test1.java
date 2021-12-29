package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		//만년 달력
		
		Scanner sc = new Scanner(System.in);
		
//		int[] months = new int[12];
//		months[0] = 31;
//		months[1] = 28; //12까지 작성하는 배열방법
		
		//월별 날짜수를 배열에 저장
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		int y,m,days,i,week;
		
		do {
			System.out.println("년도?"); //2012
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.println("월?"); //12
		    m = sc.nextInt();
		}while(m<1||m>12);
		
		//윤년에 따른 2월의 날수
		
		if(y%4==0 && y%100!=0 || y%400==0) {
			months[1] = 29;
		}
		
		//1년1월1일부터 (y-1)년12월31일까지의 날수
		days = (y-1)*365 + (y-1)/4-(y-1)/100+(y-1)/400;  //or(||) + and(&&) - 로 표시
	/*
		int yy = 	(y-1)/4-(y-1)/100+(y-1)/400;
		System.out.println(days);
		System.out.println(yy);*/
		
		//index :  0  1  2  3  4  5  6  7  8  9  10 11
		//배열 :  {31,28,31,30,31,30,31,31,30,31,30,31};
		//월(m) :  1  2  3  4  5  6  7  8  9  10 11 12
		
		//(m-1)월 말일까지의 날수
		
		for(i=0;i<m-1;i++) {
			days += months[i];
		}
		
		days += 1; //y년 m월 1일
		
		//주의 수 계산
		week = days % 7;
		
		//System.out.println(week);
		
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		for(i=0;i<week;i++) {
			System.out.print("    ");//4칸 띄기
		}
		
		for(i=1;i<=months[m-1];i++) {
			System.out.printf("%4d",i); //위에 공간에 따라( 일 = 4byte)%4d ( 일 = 3byte)%3d 이런식으로 바뀜
			
			//한 주의 날짜가 출력되면 줄 바꿈
			week++;
			if(week%7==0)
				System.out.println();
		}
		
		if(week%7!=0) {
			System.out.println();
		}
		System.out.println("------------------------------");
		
		
		
	
		
		
		

	}

}
