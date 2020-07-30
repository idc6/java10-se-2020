package com.neuedu.test;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a =100;
		
		int x = 100;
		//隐式类型转换
		long y = 200;
		
		double z = 12.34;
		//在数学运算时，也有类型转换
		System.out.println(x+y+z);
		
		int i = 128;
		byte j= (byte)i;
		System.out.println(j);
		 
		char c = 'a';
		int k =c;
		System.out.println(k);
		
		int ll = 97;
		char cc= (char)ll;
		System.out.println(cc);
		
		
		long xx = 88;
		int yy = (int)xx;
		System.out.println(yy);
	}

}
