package com.kh.day04.dimarray;

public class Exam_DimArray {
	public static void main(String [] args)
	{
		int num = 0;
		int [] nums = new int [10];
		int [][] dimNums = new int[2][5];
		System.out.println("앞의 크기 : " + dimNums.length); // 2
		System.out.println("뒤의 크기 : " + dimNums[0].length); // 5
		System.out.println("뒤의 크기 : " + dimNums[1].length); // 5
		// 이차원 배열 입력
		int [][] arrs = new int [4][4];
		int value = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = value;
				value++;
			}
		}
		// 이차원 배열 출력
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf(" %2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
}
