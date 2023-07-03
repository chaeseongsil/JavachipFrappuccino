package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		finish :
		while(true) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("====== 성적 입력 ======");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				sum += kor;
				System.out.print("영어 : ");
				eng = sc.nextInt();
				sum += eng;
				System.out.print("수학 : ");
				math = sc.nextInt();
				sum += math;
				break;
			case 2 : 
				System.out.println("====== 성적 출력 =======");
				System.out.printf("국어 : %d\n", kor);
				System.out.printf("영어 : %d\n", eng);
				System.out.printf("수학 : %d\n", math);
				System.out.printf("총점 : %d\n", sum);
				System.out.printf("평균 : %.2f\n", ((double)sum / 3));
				System.out.println();
				sum = 0;
				break;
			case 3 : 
				System.out.println("====== 종    료 =======");
				break finish; // 무한반복을 나올 수 있게 해주는 방법
			default : System.out.println("잘못 입력하셨습니다. 메뉴를 선택해주세요.");
			}
		}
	}
}
