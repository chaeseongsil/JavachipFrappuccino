package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_While {
	public void whileExercise1() {
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 
		// 입력한 수의 합을 출력하시오.
		// 정수하나 입력 : 3
		// 정수하나 입력 : 4
		// 정수하나 입력 : 7
		// 정수하나 입력 : -1
		// 입력하신 수의 합은 14입니다.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
//				int input = 0;
//				do {
//					System.out.print("정수 하나 입력 : ");
//					input = sc.nextInt();
//					if(input == -1) break;
//					sum += input;
//				}while(input != -1);
		
		while(true) {
			System.out.print("정수 하나 입력 : ");
			int input = sc.nextInt();
			if(input != -1) {
				sum += input;
			}else {
				break;
			}
		}
		System.out.println("입력하신 수의 합은 " + sum + "입니다.");
	}

	public void whileExercise2() {
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		// 1 ~ 100 사이의 홀수의 합 : 
		// if문 사용
		int i = 0;
		int sum = 0;
		while(i <= 100) {
			if(i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
		
		// if문 없이하기
		i = 1;
		sum = 0;
		while (i < 100) {
			sum += i;
			i += 2;
		}
		System.out.println("1 ~ 100 사이의 홀수의 합 : " + sum);
	}
		
}
