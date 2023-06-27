package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For3 {
	// 방과후 반복문 실습문제 part2
	Scanner sc = new Scanner(System.in);
	public void ExerciseFor1() {
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt();
		System.out.print("2의 배수 : ");
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print("3의 배수 : ");
		for(int i = 1; i <= num; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}			
		}
		System.out.println();
		System.out.print("2와 3의 공배수 : ");
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("공배수의 갯수 : " + count);
	}
	public void ExerciseFor2() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i = 0; i < input; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = input-1; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void ExerciseFor3() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i = 1; i <= input; i++) {
			for(int j = 1; j < i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void ExerciseFor4() {
		System.out.print("정수 입력 : ");
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
	public void ExerciseFor5() {
		System.out.print("소수 판별할 정수 입력 : ");
		int input = sc.nextInt();
		int count = 0;
		if(input < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for(int i = 2; i < input; i++) {
				if(input % i == 0) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println(input + "은(는) 소수입니다.");
			}else {
				System.out.println(input + "은(는) 소수가 아닙니다.");
			}
		}
	}
	public void ExerciseFor6() {
		for(;;) {
			System.out.print("소수 판별할 정수 입력 : ");
			int input = sc.nextInt();
			int count = 0;
			if(input < 2) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
				continue;
			}else {
				for(int i = 2; i < input; i++) {
					if(input % i == 0) {
						count++;
					}
				}
				if(count == 0) {
					System.out.println(input + "은(는) 소수입니다.");
				}else {
					System.out.println(input + "은(는) 소수가 아닙니다.");
				}
			}
		}
	}
	public void ExerciseFor7() {
		System.out.print("소수를 출력할 범위를 입력하세요. : ");
		int num = sc.nextInt();
		int count = 0;
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.print(num + "까지의 소수 : ");
			for(int i = 2; i <= num; i++) {
				for(int j = 1; j <= i; j++) {
					if(i % j == 0) {
						count++;
					}
				}
				if(count <= 2) {
					System.out.print(i + " ");
				}
				count = 0;
			}
		}
	}
}
