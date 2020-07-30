package com.neuedu.test.chapter3;

public class Test9 {

	public static void main(String[] args) {
		/* 100万 存银行 存三年 年利率4%  
		 * 1、算每个月多少利息
		 * 2、一年后取出  按0.3%（求：减去一年的利息剩下的是多少）*/
		double bj = 1000000;
		int sum;
		for(int i=0;i<3;i++){
			bj=(int) (bj*(1+0.04));
		}
		sum =(int) ((bj-1000000)/36);
		System.out.println("每个月的利息为"+sum);
		
		int lx,bj2=1000000;
		lx=(int)(bj2*(0.003)+bj2);
		sum = lx-sum*12;
		System.out.println("一年内取出，获得本金为"+sum);	
	}

}