package com.day3;

public class Test4 {

	public static void main(String[] args) {


		//다중 for 문
		//2중 for 문
		int i,j,k;

		for(i=2;i<=9;i++) {

			System.out.println(i + "단");

			for(j=1;j<=9;j++) {
				//System.out.println(i + " * " + j + " = " + (i * j));

				System.out.printf("%d * %d = %d\n",i,j,(i*j));

			}
			System.out.println("-----------");

		}

	}

}
