package com.neuedu.test.chapter3;

public class Test13 {
	public static void main(String[] args) {
		int a = 25000;
		int b = 28000;
		int c = 1;
		int min = a<b?a:b;
		
		for(int i=1 ; i<=a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				c = i;
			}
		}
		System.out.println(c);
	}

}
