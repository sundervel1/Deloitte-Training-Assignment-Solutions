package com.home;

public class Q1 {

	public static void main(String[] args) {
		int i, j;
		int rows = 6;

		for (i = rows; i > 0; i--) {
			for (j = i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = rows; k > i - 1; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
