package com.day4;

import com.day5.Rect;

public class Test7 {

	public static void main(String[] args) {
		
		Rect usa = new Rect();
		
		usa.input();
		int aa = usa.area();
		int ll = usa.length();
		usa.print(aa, ll);
		//Rect안에 저장되어있기에 int는 무엇을 지정하든 상관없다.
		//area와 length를 끌어오면 됨
		
		

	}

}
