package com.neuedu.test.chapter3;

public class Test9 {

	public static void main(String[] args) {
		/* 100�� ������ ������ ������4%  
		 * 1����ÿ���¶�����Ϣ
		 * 2��һ���ȡ��  ��0.3%���󣺼�ȥһ�����Ϣʣ�µ��Ƕ��٣�*/
		double bj = 1000000;
		int sum;
		for(int i=0;i<3;i++){
			bj=(int) (bj*(1+0.04));
		}
		sum =(int) ((bj-1000000)/36);
		System.out.println("ÿ���µ���ϢΪ"+sum);
		
		int lx,bj2=1000000;
		lx=(int)(bj2*(0.003)+bj2);
		sum = lx-sum*12;
		System.out.println("һ����ȡ������ñ���Ϊ"+sum);	
	}

}