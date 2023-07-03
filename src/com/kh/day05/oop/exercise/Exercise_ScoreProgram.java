package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	static int sum = 0;
	public static void main(String [] args)
	{
		finish :
		while(true) {
			Scanner sc = new Scanner(System.in);
			printMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				inputScore();
				break;
			case 2 : 
				printScore();
				break;
			case 3 : 
				showGoodBye();
				break finish; // 무한반복을 나올 수 있게 해주는 방법
			default : printException();
			}
		}
		
	}
	public static void printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
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
	}
	
	public static void printScore() {
		
		System.out.println("====== 성적 출력 =======");
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", ((double)sum / 3));
		System.out.println();
		sum = 0;
	}
	
	public static void showGoodBye() {
		System.out.println("====== 종    료 =======");
	}
	
	public static void printException() {
		System.out.println("잘못 입력하셨습니다. 메뉴를 선택해주세요.");
	}
}
