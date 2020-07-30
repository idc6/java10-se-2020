package com.neuedu.test.chapter3;

public class Test12 {

	public static void main(String[] args) {
		int num = 9;
		boolean flag = true;//是质数
		for(int i=2;i<=num-1;i++){
			if(num%i==0){
				flag = false;//不是质数
				//整除了
				System.out.println("不是质数");
				break;
			}
		}
		if(flag)//没整除{
			//break到这
			System.out.println("是质数");
		}

	}


