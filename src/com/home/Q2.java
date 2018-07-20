package com.home;

public class Q2 {
	public static void main(String[] args) {
		int i;
		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "abcxyz";

		for (i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.print(s1 + " ");
			} else if (i % 5 == 0) {
				System.out.print(s2 + " ");
			} else if ((i % 3 == 0) && (i % 5 == 0)) { // it is not prinitng abcxyz as it is taken by first if condition
				System.out.print(s3 + " ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
