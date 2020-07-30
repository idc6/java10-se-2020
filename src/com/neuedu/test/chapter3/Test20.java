package com.neuedu.test.chapter3;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÀûÈó£º");
		double x = s1.nextInt();
		double y;
		if(x<=100000){
			y=x*(1+0.1);
			System.out.println(y);
		}
		else if(x>100000 && x<=200000){
			y=x*(1+0.075);
			System.out.println(y);
		}
		else if(x>200000 && x<=400000){
			y = x*(1+0.05);
			System.out.println(y);
		}
		else if(x>400000 && x<=600000){
			y = x*(1+0.03);
			System.out.println(y);
		}
		else if(x>600000 && x<=1000000){
			y = x*(1+0.015);
			System.out.println(y);
		}
		else{
			y = x*(1+0.01);
			System.out.println(y);
		}
		
			}

}
