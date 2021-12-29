//1~3사이의 난수를 발생시켜 가위,바위,보 게임 프로젝트 작성

package com.day4;

import java.util.Random;
import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int su,com;
		String str;
		
		String[] a ={"가위","바위","보"};

		com = rd.nextInt(3);

		System.out.print("1:가위, 2:바위, 3:보 ?");

		su = sc.nextInt()-1;

	System.out.println("컴퓨터 :" + a[com] + " 사람 :" + a[su]);

	if(com==su)
		str="비겼습니다";
	else if((su+2)%3==com)	//수학공식
		str="당신이 이겼습니다";
	else
		str="컴퓨터가 이겼습니다";

	System.out.println(str);

	}

}