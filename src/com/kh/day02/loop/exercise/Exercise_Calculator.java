package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String [] args)
	{
		for(;;) {
			System.out.print("정수 하나 입력 : ");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			char calc = sc.next().charAt(0);
			int result = 0;
			switch (calc) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			default :
				System.out.println("그만합시다.");
			}
			if(calc != '+' && calc != '-' && calc != '*' && calc != '/' && calc != '%') {
				break;
			}
			System.out.println(num1 + " " + calc + " " + num2 + " = " + result);
		}
	}
}
