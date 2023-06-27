package com.kh.day02.operator.exercise;

public class Exercise_Logical3 {
	public static void main(String [] args)
	{
		// 50, 30을 입력받아 결과 예상해보고 출력하기
		int a = 50;
		int b = 30;
		boolean result1, result2, result3, result4;
		result1 = a!=b && a<b; // false
		result2 = a<b || a==b; // false
		result3 = a>b && a!=b; // true
		result4 = a>b || a==b; // true
		System.out.println("a!=b && a<b 의 결과값 : " + result1);
		System.out.println("a<b || a==b 의 결과값 : " + result2);
		System.out.println("a>b && a!=b 의 결과값 : " + result3);
		System.out.println("a>b || a==b 의 결과값 : " + result4);
		
	}
}
