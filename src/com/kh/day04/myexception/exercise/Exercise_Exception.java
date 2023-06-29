package com.kh.day04.myexception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void exercise1() {
		// 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
		// 다시 입력받는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		// for(;;) {}
		// while(true) {}
		while(true) {
			// multi catch 절 
			try 
			{
				System.out.print("정수 하나 입력 : ");
				int num1 = sc.nextInt();
				System.out.print("정수 하나 더 입력 : ");
				int num2 = sc.nextInt();
				int result = num1 / num2;
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다.",num1, num2, result);
				break;
			}catch(ArithmeticException e)
			{
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
			}catch(InputMismatchException ie)
			{
				System.out.println("문자를 입력할 수 없습니다. 다시 입력하세요.");
				sc.next(); // 없으면 무한반복됨
			}
		}
	}
	public void practice2() {
		// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라.
		// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 InputMismatchException 예외를
		// 처리하여 다시 입력받도록 하여라
		Scanner sc = new Scanner(System.in);
		while(true) {
			try 
			{
				System.out.print("첫번째 정수 입력 : ");
				int num1  = sc.nextInt();
				System.out.print("두번째 정수 입력 : ");
				int num2 = sc.nextInt();
				System.out.print("세번째 정수 입력 : ");
				int num3 = sc.nextInt();
				int sum = 0;
				sum = num1 + num2 + num3;
				System.out.printf("%d + %d + %d = %d", num1, num2, num3, sum);
				break;
			}catch(InputMismatchException e)
			{
				System.out.println("문자를 입력할 수 없습니다. 다시 입력하세요.");
				sc.next();
			}			
		}
	}
}
