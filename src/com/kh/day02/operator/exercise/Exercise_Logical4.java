package com.kh.day02.operator.exercise;

public class Exercise_Logical4 {
	public static void main(String [] args)
	{
		// 70, 55를 a, b로 입력받아 다음과 같은 식을 작성하였을 때 
		// 결과값을 예상해보고 출력해보자
		int a = 70;
		int b = 55;
		boolean result1, result2, result3, result4;
		result1 = a==b || a++<100; // true, a:71, b:55
		// *** &&의 경우 앞이 false이면 뒤는 계산하지 않는다. ***
		result2 = a<b && --b<55; // false, a:71, b:55
		result3 = a!=b && b--<a++; // true, a:72, b:54
		// *** ||의 경우 앞이 true이면 뒤는 계산하지 않는다. ***
		result4 = a++!=b || b++>=85; // true, a:73, b:54
		System.out.println("result1의 결과값 : " + result1);
		System.out.println("result2의 결과값 : " + result2);
		System.out.println("result3의 결과값 : " + result3);
		System.out.println("result4의 결과값 : " + result4);
		// a : 73, b : 54
		System.out.println("a의 결과값 : " + a);
		System.out.println("b의 결과값 : " + b);
	}
}
