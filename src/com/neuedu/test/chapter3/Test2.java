package com.neuedu.test.chapter3;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("���������");
		int year = s1.nextInt();
		if(year %400 ==0)
		{
			System.out.println(year +"������");
		}
		else if(year %4 ==0 && year %100!=0)
		{
			System.out.println(year +"������");
		}
		else
		{
			System.out.println(year +"��������");
		}


	}

}
