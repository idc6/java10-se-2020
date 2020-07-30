package com.neuedu.test;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("请输入成绩");
		int score = s1 .nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("请输入年级");
		int nianji = s2 .nextInt();
		if(score>60){
			if(nianji>3&&nianji<=6){
				System.out.println("都"+nianji+"年级了，才考"+score+"分，你是张文涛吧");
			}
		}
		else {
			System.out.println("叫你爹来我办公室");
		}
		
	}

}
