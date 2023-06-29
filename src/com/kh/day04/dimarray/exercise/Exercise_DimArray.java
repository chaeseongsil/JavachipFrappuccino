package com.kh.day04.dimarray.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_DimArray {
	public void exercise1() {
		int [][] arrs = new int[5][5];
		int value = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs[i].length-1; j >= 0; j--) {
				arrs[i][j] = value;
				value++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf(" %2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise2() {
		int [][] arrs = new int[5][5];
		int value = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[j][i] = value;
				value++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf(" %2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise3() {
		int [][] arrs = new int[5][5];
		int value = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs.length-1; j >= 0; j--) {
				arrs[j][i] = value;
				value++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf(" %2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise4() {
		int [][] arrs = new int[5][5];
		int value = 1;
		
		for(int i = 0; i < arrs.length; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < arrs[i].length; j++) {
					arrs[i][j] = value;
					value++;
				}
			}else {
				for(int j = arrs[i].length-1; j >= 0; j--) {
					arrs[i][j] = value;
					value++;
				}
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf(" %2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		double [][] score = {{3.52, 3.02}, {3.41, 3.47}, {3.06, 4.40}, {3.99, 3.75}};
		double sum = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
		}
		int n = score.length;
		int m = score[0].length;
		System.out.printf("전체 평점 평균 : %.2f", sum/(n*m));
	}
	
	public void exercise6() {
		int [][] arrs = new int[5][5];
		int value = 1;
		
		for(int i = 0; i < arrs.length; i++) {
			if(i % 2 == 0) {
				for(int j = arrs[i].length-1; j >= 0; j--) {
					arrs[i][j] = value;
					value++;
				}
			}else {
				for(int j = 0; j < arrs[i].length; j++) {
					arrs[i][j] = value;
					value++;
				}
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf(" %2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise7() {
		int [][] arrs = new int[5][5];
		int value = 1;
		
		for(int i = 0; i < arrs.length; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < arrs[i].length; j++) {
					arrs[j][i] = value;
					value++;
				}				
			}else {
				for(int j = arrs[i].length-1; j >= 0; j--) {
					arrs[j][i] = value;
					value++;
				}		
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf(" %2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise8() {
		int [][] arrs = new int[5][5];
		int value = 1;
		
		for(int i = 0; i < arrs.length; i++) {
			if(i % 2 == 0) {
				for(int j = arrs[i].length-1; j >= 0; j--) {
					arrs[j][i] = value;
					value++;
				}		
			}else {
				for(int j = 0; j < arrs[i].length; j++) {
					arrs[j][i] = value;
					value++;
				}				
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf(" %2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	
	public void exercise9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로행의 개수를 입력하세요(1~10) ==> ");
		int n = sc.nextInt();
		System.out.print("세로열의 개수를 입력하세요(1~10) ==> ");
		int m = sc.nextInt();
		if(n < 1 || n > 10 || m < 1 || m > 10) {
			System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
			System.out.print("가로행의 개수를 입력하세요(1~10) ==> ");
			n = sc.nextInt();
			System.out.print("세로열의 개수를 입력하세요(1~10) ==> ");
			m = sc.nextInt();
		}
		Random rand = new Random();
		char [][] arrs = new char[n][m];
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = (char) (rand.nextInt(26)+ 97);
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf(" %c ", arrs[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void exercise10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정사각행렬의 사이즈를 입력하시오 > ");
		int size = sc.nextInt();
		System.out.print("2차원 배열 크기 입력(정방형) > ");
	}
}
