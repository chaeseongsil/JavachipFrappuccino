package com.kh.day01.operator;

public class Exam_Unary {
	public static void main(String [] args) 
	{
//		// 단항 연산자
//		int a = 1;
//		// a++, ++a -> a = a + 1; 
//		System.out.println(a++); // 후위연산(나중연산) a를 출력한 후 1을 더함 
//		// a가 2인 상태
//		System.out.println(++a); // 전위연산(먼저연산) 1을 더한 후 a를 출력
//		// a가 3인 상태
//		System.out.println(a);
		
		// 문제1
		int a = 10;
		int b = 20;
		int c = 30;
		a++; // 11
		b=(--a)+b; // --(11)+20 -> 30 
		c=(a++)+(--b); // (10++)+(--30) -> 39
		// a = 11, b = 29, c = 39
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		
		// 문제2
		boolean flag = true;
		System.out.println(!!!!flag); // true
		
		// 문제3
		int x = 100;
		int y = 33;
		int z = 0;
		x--; // x : 99
		z = x-- + --y; // 99 + 32 = 131 / x : 98, y : 32, z : 131
		x = 99 + x++ + x; // 99 + 98 + 99 / x : 296
		y = y-- + y + ++y; // 32 + 31 + 32 / y : 95
		// x : 296, y : 95, z : 131
		System.out.println("x : " + x + ", y : " + y + ", z : " + z);
		
	}
}
