package com.neuedu.test.chapter3;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("���������");
		int x = s1.nextInt();
		switch(x/10){
		case 9:
			System.out.println("����");
			break;
		case 8:
			System.out.println("�е�");
			break;
		case 7:
			System.out.println("����");
			break;
		case 6:
			System.out.println("����");
			break;
			default:
				System.out.println("������");
			break;
		}

	}

}
