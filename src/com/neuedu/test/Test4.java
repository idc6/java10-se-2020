package com.neuedu.test;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("������ɼ�");
		int score = s1 .nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("�������꼶");
		int nianji = s2 .nextInt();
		if(score>60){
			if(nianji>3&&nianji<=6){
				System.out.println("��"+nianji+"�꼶�ˣ��ſ�"+score+"�֣����������ΰ�");
			}
		}
		else {
			System.out.println("��������Ұ칫��");
		}
		
	}

}
