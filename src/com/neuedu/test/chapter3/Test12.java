package com.neuedu.test.chapter3;

public class Test12 {

	public static void main(String[] args) {
		int num = 9;
		boolean flag = true;//������
		for(int i=2;i<=num-1;i++){
			if(num%i==0){
				flag = false;//��������
				//������
				System.out.println("��������");
				break;
			}
		}
		if(flag)//û����{
			//break����
			System.out.println("������");
		}

	}


