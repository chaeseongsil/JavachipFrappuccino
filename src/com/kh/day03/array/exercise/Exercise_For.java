package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void forExercise1() {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
				// 1+2+3+4+5+6+7+8+9+10=55
				int sum = 0;
				for(int i = 1; i <= 10; i++) {
					sum += i;
					if(i != 10) {
						System.out.print(i + "+");				
					}else {
						System.out.print(i + "=" + sum);
					}
				}
	}
	
	public void forExercise2() {
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
				// 그 수의 구구단을 출력하세요.
				// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
				System.out.print("정수 하나 입력 : ");
				Scanner sc = new Scanner(System.in);
				int dan = sc.nextInt();
				if(dan >= 1 && dan <= 9) {
					System.out.println(dan + "단");
					for(int i = 1; i <= 9; i++) {
						System.out.println(dan + " * " + i + " = " + dan*i);
					}
				}else {
					System.out.println("1 ~ 9사이의 양수를 입력해야 합니다.");
				}
	}
	
	public void forDoubleExercise1() {
		// 구구단 출력
				// 2단 옆에 3단, 3단 옆에 4단, ... 되도록 출력
				for(int k = 1; k < 10; k++){
					for(int h = 2; h < 10; h++) {
						System.out.print(h + " * " + k + " = " + h*k + "\t");		
						// \t 사용하면 일정한 간격으로 띄워줌
					}			
					System.out.println();
				}
	}
	
	public void forDoubleExercise2() {
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
	
	public void forDoubleExercise3() {
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j < 60; j++) {
				System.out.printf("%2d시 %2d분\n",i,j);
			}
		}
	}
}
