package com.neuedu.test.chapter3;


import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		//将一个数分解质因数
		Scanner x = new Scanner(System.in);
		System.out.println("请输入");
		int y = x.nextInt();
		for(int i=2;i<=y;i++){
			if(y%i==0 && y!=i){
				System.out.print(i+"*");
				y=y/i;
				i=2;
			}
			if(i==y){
				System.out.println(y);
				break;
			}
		}
		
  


	}

	

}
