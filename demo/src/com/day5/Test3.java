package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {	
		
		//jumin : 941228-1056789
		//check : 234567 892345
		
		//�� = (9*2) + (4*3) +...+ (8*5)
		//�� = 11 - �� % 11
		//�� = ��%10
		//�� == 9 (�ֹι�ȣ �� ���ڸ� ���� ����)
		
		Scanner sc = new Scanner(System.in);
		
		String jumin;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		int i,tot,su;
		
		System.out.print("�ֹι�ȣ[xxxxxx-xxxxxxx]? : ");
		jumin = sc.next();
		//�ֹι�ȣ�� �Է� �޴´�
		
		if(jumin.length()!=14) {
			System.out.println("�Է� ���� !!!");
		    return; //exit(����)
		    //14�ڸ��� ������ �н� Ʋ���� ����
			
		}
		tot = 0;
		//index : 01234567890123
		//jumin : 941228-1056789
		//check : 234567 892345
		for(i=0;i<12;i++) {
			
			if(i>=6) {//���ڸ� ��
				tot += chk[i] * Integer.parseInt(jumin.substring(i+1,i+2));
			}else { //�������
				tot += chk[i] * Integer.parseInt(jumin.substring(i,i+1));
				
			}
			
		}
		
		su = 11 - tot % 11;
		su = su % 10;
		
		if(su == Integer.parseInt(jumin.substring(13))) {
			System.out.println("��Ȯ�� �ֹι�ȣ !!!");
			
		}else{
			System.out.println("����Ȯ�� �ֹι�ȣ !!!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}


/*String str = "seoul korea";
index :     012345678910(0)


System.out.println(str);
System.out.println(str.substring(0, 8));//ù index ������
System.out.println(str.substring(6, 8));//�ι�° index ������ ���
System.out.println(str.substring(6));//���ں����� index���� ������ ���
*/