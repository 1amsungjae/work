//1에서 100까지의 수중 3의 배수의 갯수
//3의 배수의 갯수 : 33
//수를 나누었을때 0으로 떨어질때마다 증가시키기 i++

package com.day3;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		int n =0, cnt;
		
		cnt=0;
		while(n<100) {
			n++;
			if(n%3==0)
				cnt++;
		}
		System.out.println("3의 배수의 갯수 : "+cnt);

	}

}
