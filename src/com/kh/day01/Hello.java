package com.kh.day01;

public class Hello {
	
	public static int sum(int num1, int num2) {
		// void는 리턴값이 없음
		// void 대신 타입값을 지정 -> return 값의 타입
		return num1 + num2;
	}
	public static void main(String [] args) {
		int i = 20;
		int s;
		char a;
		
		a = '?';
		s = sum(i, 10);
		System.out.println(s);
		System.out.println(a);
		System.out.println("Hello");
		// control + shift + c : 주석
		// control + y : 앞으로 돌리기
		
	
	}
}
