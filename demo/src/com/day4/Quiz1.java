//5개의 정수를 입력받아 입력받은 수를 출력하고 
//입력받은 수 중 가장 큰 수와 작은 수를  출력

package com.day4;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {



		int[] su = new int[5];
		int i,max,min;

		Scanner sc = new Scanner(System.in);

		for(i=0;i<su.length;i++){

			System.out.print("정수?[5개]");
			su[i] = sc.nextInt();
		}
	
		//max와 min구할때 사용
		//값을 넣어놓고 다른 수와 비교
		max=min=su[0];

		for(i=1;i<su.length;i++){
			if(max<su[i])
				max=su[i];
			if(min>su[i])
				min=su[i];
		}
			System.out.printf("가장 작은수 : %d, 가장 큰수 %d",min,max);	
			System.out.println();	

	}
}

/*
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		int i,j,temp;

		System.out.print("숫자는?");
		for(i=0;i<num.length;i++) {
			num[i] = sc.nextInt();
		} 
		System.out.print("Source Data  : ");
		for(i=0;i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		// 5개의 정수를 입력받아 출력


		for(i=0;i<num.length-1;i++) {

			for(j=i+1;j<num.length;j++) {

				//System.out.println(i + ":" + j);

				if(num[i]<num[j]) {

					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		//숫자를 비교

		System.out.print("가장 큰 수   : ");
		for(int k : num) {
			System.out.printf("%4d",k);
		}

		//가장 큰수

		System.out.println();

		for(i=0;i<num.length-1;i++) {

			for(j=i+1;j<num.length;j++) {

				//System.out.println(i + ":" + j);

				if(num[i]>num[j]) {

					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		//숫자 비교
		System.out.print("가장 작은 수 : ");
		for(int l : num) {
			System.out.printf("%4d",l);
		}
		//가장 작은 수


	}

}
 */