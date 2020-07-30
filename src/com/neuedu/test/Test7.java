package com.neuedu.test;

public class Test7 {

	public static void main(String[] args) {
		int a,b,c,d,g,y,z,o;
		int sum = 0;
		int x = 1354;
		
		//int b = x/100;
		//int c = x/10%10;
		//int d = x%10;
		
		a = x/1000;
		b = x/100%10;
		c = x/10%10;
		d = x%10;
		
		g = d*1000;
		y = c*100;
		z = b*10;
		o = a;
		 sum = g+y+z+o;
		System.out.println(x+"的各位数的和为"+sum);
		//char c ='G';
		//char c2 =(char)( c + 32);
		//System.out.println(c2);
	}
 
}
