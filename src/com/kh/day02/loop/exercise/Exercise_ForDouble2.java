package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_ForDouble2 {
	public static void main(String [] args)
	{
		System.out.print("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
