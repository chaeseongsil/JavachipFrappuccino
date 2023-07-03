package com.kh.day06.oop.student;

import java.util.Scanner;

public class StudentRun {
	public static void main(String[] args) {
		Student [] stds = new Student[2];
		finish : 
		while(true) {
			int choice = printMenu();
			switch(choice) {
			case 1 : 
				inputScore(stds);
				break;
			case 2 :
				printScore(stds);
				break;
			case 3 :
				checkPass(stds);
				break;
			case 4 :
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
			default:
				System.out.println("1 ~ 4 사이의 숫자를 입력해주세요.");
			}
			
		}
	}
	public static int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 학생 성적 확인 프로그램 ====");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		System.out.println();
		System.out.println(1);
		System.out.println('A');
		System.out.println("Hello Java");
		System.out.println(true);
		return choice;
	}
	public static void inputScore(Student [] stds) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < stds.length; i++) {
			stds[i] = new Student();
			System.out.println((i+1) + "번째 학생 정보 입력");
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			stds[i].setName(name);
			System.out.print("1차 점수 입력 : ");
			int score1 = sc.nextInt();
			stds[i].setScore1(score1);
			System.out.print("2차 점수 입력 : ");
			int score2 = sc.nextInt();
			stds[i].setScore2(score2);
		}
	}
	public static void printScore(Student [] stds) {
		for(int i = 0; i < stds.length; i++) {
			System.out.println((i+1) + "번째 학생 정보 출력");
			System.out.println(stds[i].getName() + " 학생의 점수는");
			System.out.println("1차 점수 : " + stds[i].getScore1() + "점, 2차 점수 : " + stds[i].getScore2() + "점 입니다.");
			System.out.println();
		}
	}
	public static void checkPass(Student [] stds) {
		for(int i = 0; i < stds.length; i++) {
			System.out.println((i+1) + "번째 " + stds[i].getName() + " 학생의 확인 결과");
			if(!stds[i].reExamYN1()) {
				System.out.println("1차 시험 재평가 대상자입니다.");
			}
			if(!stds[i].reExamYN2()) {
				System.out.println("2차 시험 재평가 대상자입니다.");
			}
			if(stds[i].reExamYN1() && stds[i].reExamYN2()) {
				System.out.println("1, 2차 모두 통과하셨습니다.");
			}
			System.out.println();
		}
	}
}
