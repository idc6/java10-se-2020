package com.neuedu.test.chapter3;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i < 1000; i++) { // ѭ��������λ��
            int a = i % 10; // ��ֳ���λ����
            int b = (i / 10) % 10; // ��ֳ�ʮλ����
            int c = i / 100; // ��ֳ���λ����
            // �ж��������Ƿ��������
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }
	}

}
