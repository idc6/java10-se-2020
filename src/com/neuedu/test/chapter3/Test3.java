package com.neuedu.test.chapter3;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// �ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6������
		//��ֻ�ܱ�5��������ӡ�ܱ�5������
		//��ֻ�ܱ�6����������ӡ�ܱ�6������
		//���ܱ�5��6����������ӡ���ܱ�5��6������
		Scanner s1 = new Scanner(System.in);
		System.out.println("����������");
		int x = s1.nextInt();
		if(x%5==0&&x%6==0){
			System.out.println(x+"�ܱ�5��6����");
		}
		else if (x%5==0){
			System.out.println(x+"�ܱ�5����");
		}
		else if (x%6==0){
			System.out.println(x+"�ܱ�6����");
		}
		else{
			System.out.println(x+"���ܱ�5��6����");
		}

	}

}
