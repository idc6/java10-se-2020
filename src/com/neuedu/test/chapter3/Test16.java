package com.neuedu.test.chapter3;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i < 1000; i++) { // 循环所有三位数
            int a = i % 10; // 拆分出个位数字
            int b = (i / 10) % 10; // 拆分出十位数字
            int c = i / 100; // 拆分出百位数字
            // 判断立方和是否等于自身
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }
	}

}
