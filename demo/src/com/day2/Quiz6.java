//이름과 3과목을 입력받아
//모든 과목의 점수가 40점이상 평균이 60점이상 합격
//한과목이라도 점수가 40점미만 평균이 60점 이상 과락
//평균이 60점 미만이면 불합격
package com.day2;

import java.util.Scanner;

public class Quiz6{

	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	String name;
	int kor,eng,mat,tot,avg;
	String pan;

	System.out.print("이름 ? ");
	name=sc.next();
	System.out.print("세과목 점수 ?");
	kor=sc.nextInt();
	eng=sc.nextInt();
	mat=sc.nextInt();

	tot=kor+eng+mat;
	avg=tot/3;

	if(kor>=40&&eng>=40&&mat>=40&&avg>=60)
		pan="합격";
	else if(avg>=60)
		pan="과락";
	else
		pan="불합격";

	System.out.println("이름 : " + name);
	System.out.println("총점 : " + tot + " 평균 : " + avg + " 판정 : " + pan);



	}
}