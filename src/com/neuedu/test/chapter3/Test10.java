package com.neuedu.test.chapter3;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		int m=0;
		System.out.println("请输入一个四位数字");
		Scanner scanner=new Scanner(System.in);
		m=scanner.nextInt();
		int n=0;
		for (int i = 4; i >=1; i--)
		{    n=m%10;
				{System.out.print(n);
				 m=m/10;
				}	
			
		}

	}
}
