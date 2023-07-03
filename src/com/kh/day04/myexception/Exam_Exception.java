package com.kh.day04.myexception;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String [] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 하나 입력 : ");
			int input1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int input2 = sc.nextInt();
			System.out.println("나눠드릴게요^^. 조금만 기다리세요~");
			int result = input1 / input2;
			System.out.printf("몫은 %d입니다.~", result);			
		}catch(ArithmeticException e)
		{
			// System.out.println("0으로는 나눌 수 없습니다.");
			// e.printStackTrace(); // 예외처리 하지 않았을 때와 메시지는 같지만 의도한 것!
			System.out.println(e.getMessage()); // 오류에서 메시지만 가져옴 -> by zero
		}
		
	}
}
