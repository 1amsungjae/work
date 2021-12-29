 package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		//10명 이내의 이름과 점수를 입력 받아
		//점수가 높은 사람에서 낮은 사람 순으로 출력 (점수 내림차순)

		Scanner sc = new Scanner(System.in);//사용자한테 값을 받을때 스캐너 사용

		String[] neme;
		int[] score;

		int i,j,inwon,temp1; //  < 왼쪽이 젤 큰값 ,오른쪽이 젤 작은 값
		String temp2;

		do {
			System.out.print("인원수?[1~10]");
			inwon = sc.nextInt();
		}while(inwon<1 || inwon>10);

		//배열 메모리 할당(객체생성)
		String[] name = new String[inwon];
		score = new int[inwon];

		for(i=0;i<inwon;i++) {
			System.out.print("이름?");
			name[i] = sc.next();
			System.out.println("점수?");
			score[i] = sc.nextInt();

		}	
		


		// Selection Sort
		for(i=0;i<score.length-1;i++) {
			for(j=i+1;j<score.length;j++) {

				if(score[i]<score[j]) {

					temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;
					//점수 score 크기순 자리바꿈
					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
					//이름 name 자리 바꿈
				}
			}
		}

		//총점 정렬
		for(i=0;i<inwon;i++) {
			System.out.printf("%6s %4d\n",name[i],score[i]);
		}
	}
}





