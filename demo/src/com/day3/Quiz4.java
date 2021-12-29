//가로로 구구단 출력하기

package com.day3;

public class Quiz4 {

	public static void main(String[] args) {
		int i,j,k,n=2,m=5;

		for(i=0;i<=1;i++){
			
			for(j=1;j<=9;j++){
				
				for(k=n;k<=m;k++){
						System.out.print(k+"*"+j+"="+(k*j)+"\t");
				}

			System.out.println(); //4개 찍고 줄바꿈
			}
			System.out.println(); //6단부터 줄바꿈
			n=6; m=9;
		}

	}

}
