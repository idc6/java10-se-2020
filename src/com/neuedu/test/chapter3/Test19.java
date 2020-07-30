package com.neuedu.test.chapter3;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("请输入任意位数");
		int y = x.nextInt();
		int z = 1;
		 for(int i=10;i<10000;i*=10){
			if(y/i!=0){
				z++;
				
			}
			else {
				break;
			}
			
		}System.out.println(z);
		

	}

}
