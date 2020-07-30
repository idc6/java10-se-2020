package com.neuedu.test.chapter3;

public class Test23 {

	public static void main(String[] args) {
		int n = 5;
		int a = 0;
		int b = 0;
		for (int i = n; i >= 1; i--) {
			if (a != (n - i)) {
				System.out.print(" ");
				a++;
				i = i + 1;
			} else if (b != (2 * i - 1)) {
				System.out.print("*");
				b++;
				i = i + 1;
			} else if (a == (n - i) && b == (2 * i - 1)) {
				System.out.println();
				a = 0;
				b = 0;
			}
		}
	}

}
