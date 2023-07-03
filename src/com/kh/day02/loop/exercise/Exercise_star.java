package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_star {
	public static void main(String [] args)
	{
		System.out.print("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i = 1; i <=input; i++) {
			if(i == 1 || i == input) {
				for(int j = 1; j <=input; j++) {
					System.out.print("*");
				}
			}else {
				for(int k = 1; k <=input; k++) {
					if(k == 1 || k == input) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
