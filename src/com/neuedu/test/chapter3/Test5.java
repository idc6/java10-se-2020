package com.neuedu.test.chapter3;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("请输入分数");
		int x = s1.nextInt();
		switch(x/10){
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("中等");
			break;
		case 7:
			System.out.println("良好");
			break;
		case 6:
			System.out.println("及格");
			break;
			default:
				System.out.println("不及格");
			break;
		}

	}

}
