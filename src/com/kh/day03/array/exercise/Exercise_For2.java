package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For2 {
	// 방과후 반복문 실습문제 part1
	public void ExerciseFor1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		}
	}
	public void ExerciseFor2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요. ");
		}else {
			for(int i = input; i > 0; i--) {
				System.out.print(i + " ");
			}
		}
	}
	public void ExerciseFor3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= input; i++) {
			sum += i;
			if(i != input) {
				System.out.print(i + "+");
			}else {
				System.out.print(i + "=" + sum);
			}
		}
	}
	public void ExerciseFor4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 두개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력하세요.");
		}else {
			if(num1 < num2) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}else {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}
	public void ExerciseFor5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력한 구구단 단수를 입력하세요. : ");
		int dan = sc.nextInt();
		if(dan < 1 || dan > 9) {
			System.out.println("구구단 모르세요?");
		}else {
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			}			
		}
	}
	public void ExerciseFor6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 단수를 입력하세요 : ");
		int dan = sc.nextInt();
		if(dan < 1 || dan > 9) {
			System.out.println("9이하의 숫자만 입력하세요.");
		}else {
			for(int i = dan; i < 10; i++) {
				System.out.println(i + "단");
				for(int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i*j );
				}
				System.out.println();
			}
		}
	}
}
