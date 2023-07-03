package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	public static void main(String [] args)
	{
		finish :
		while(true) {
			Scanner sc = new Scanner(System.in);
			printMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				Student.inputScore();
				break;
			case 2 : 
				Student.printScore();
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
	
	
	
	public static void showGoodBye() {
		System.out.println("====== 종    료 =======");
	}
	
	public static void printException() {
		System.out.println("잘못 입력하셨습니다. 메뉴를 선택해주세요.");
	}
}
