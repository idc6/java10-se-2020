package com.neuedu.test.chapter3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 判断一个数字是否能被5和6同时整除（打印能被5和6整除）
		//或只能被5整除（打印能被5整除）
		//或只能被6整除，（打印能被6整除）
		//不能被5或6整除，（打印不能被5或6整除）
		Scanner s1 = new Scanner(System.in);
		System.out.println("请输入数字");
		int x = s1.nextInt();
		if(x%5==0&&x%6==0){
			System.out.println(x+"能被5和6整除");
		}
		else if (x%5==0){
			System.out.println(x+"能被5整除");
		}
		else if (x%6==0){
			System.out.println(x+"能被6整除");
		}
		else{
			System.out.println(x+"不能被5或6整除");
		}

	}

}
