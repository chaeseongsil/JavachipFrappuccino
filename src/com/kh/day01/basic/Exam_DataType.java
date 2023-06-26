package com.kh.day01.basic;

public class Exam_DataType {
	public static void main (String [] args) 
	{
		// 데이터 타입
		// 기본형
		// boolean(1) / char(2) / byte(1), short(2), int(4), long(8) / float(4), double(8)
		// 참조형
		// String
		
		boolean result = true;
		
		char fChar = 'a';
		
		String sStr = "Hello Java";
		// 정수 part
		byte bNum = 127; // 최대값
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483648l; // 접미사 l을 붙여야 함.
		
		// 실수 part
		float fNum = 23.0626f; // 접미사 f를 붙여야 함.
		double dNum = 23.1026;
	}
}
