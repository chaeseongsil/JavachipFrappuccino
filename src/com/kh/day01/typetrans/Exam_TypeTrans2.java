package com.kh.day01.typetrans;

public class Exam_TypeTrans2 {
	public static void main (String [] args)
	{
		byte bNum = 127;
		int iNum = 100;
		int iNum2 = 10;
		double dNum = 4.0;
		
		// 자동 형변환
		System.out.println(bNum + iNum); // byte -> int => 227
		System.out.println(iNum2 / dNum); // int -> double => 2.5
		// 강제 형변환
		System.out.println((byte)(bNum + iNum)); // 227 -> -29 데이터 손실
		System.out.println((int)2.9 + 1.8);
		// 자동 형변환 : int -> double, 강제 형변환 : double -> int
		System.out.println((int)(2.9 + 1.8)); // 4.7 -> 4
		System.out.println((int)2.9 + (int)1.8); // 2 + 1 = 3
	}

}
