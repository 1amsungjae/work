package com.day4;

import java.util.Random;

public class Test5_lotto {

	public static void main(String[] args) {

		//1~45 까지의 수 중에서 6개의 난수를 발생시켜 크기 순으로 정렬
		//Random

		Random rd = new Random();
		int[] num = new int[6];
		int i,j,n,temp;

		n = 0;

		while(n<6) {
			num[n] = rd.nextInt(45)+1;
			
			for(i=0;i<n;i++) {				
				if(num[i] == num[n]) {
					n--;
					break; //for을 빠져나가는 break
				}				
			}
			n++;
		}		
		//정렬
		for(i=0;i<num.length-1;i++) {
			for(j=i+1;j<num.length;j++) {
				
				if(num[i]>num[j]) {
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					//자리바꿈		
				}
			}
		}
		//for(int i=0;i<num.length;i++) 이렇게 써도됨
		for(int su : num) {
			System.out.printf("%4d",su);
		}
	}
}
