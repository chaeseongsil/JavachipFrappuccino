package com.kh.day01.typetrans;

public class Exam_TypeTrans1 {
	public static void main(String [] args) 
	{
		// int * int = int, double + double = double
		// int * double -> 자동 형변환
		int iNum = 10;
		double dNum = 3.14;
		double result = dNum * iNum; // iNum의 10 -> 10.0 자동 형변환
		System.out.println("result : " + result); // 31.400000000000002
		System.out.println("강제 형 변환 : " + (int)result); // 31 출력
		System.out.println("강제 형 변환2 : " + (char)65); // A 출력
	}
}
