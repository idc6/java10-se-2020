package com.neuedu.test.chapter3;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("������ɼ���");
		int x = s1.nextInt();
		switch(x/10){
		case 10:
		case 9:System.out.println("�ȼ�ΪA");
		break;
		case 8:System.out.println("�ȼ�ΪB");
		break;
		case 7:System.out.println("�ȼ�ΪC");
		break;
		case 6:System.out.println("�ȼ�ΪD");
		break;
		default:
		System.out.println("�ȼ�ΪE");
		}
	}

}
