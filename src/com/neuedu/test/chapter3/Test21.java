package com.neuedu.test.chapter3;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int x = s1.nextInt();
		switch(x/10){
		case 10:
		case 9:System.out.println("等级为A");
		break;
		case 8:System.out.println("等级为B");
		break;
		case 7:System.out.println("等级为C");
		break;
		case 6:System.out.println("等级为D");
		break;
		default:
		System.out.println("等级为E");
		}
	}

}
