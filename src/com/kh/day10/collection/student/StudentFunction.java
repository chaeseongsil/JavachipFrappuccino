package com.kh.day10.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFunction {
	
	List<Student> stdList = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);
	public int printMenu() {
		System.out.println("============== Menu ===============");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 재시험 여부 확인");
		System.out.println("5. 프로그램 종료");
		System.out.println("===================================");
		System.out.print("메뉴 선택 > ");
		int choice = sc.nextInt();
		return choice;
	}
	public void inputInfo() {
		System.out.println("========== 학생 정보 입력 ===========");
		System.out.print("학생 이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("2차 점수 : ");
		int score2 = sc.nextInt();
		Student std = new Student(name, score1, score2);
		stdList.add(std);
	}
	public void printInfo() {
		System.out.println("========== 학생 정보 출력 ===========");
		for(Student student : stdList) {
			System.out.println(student.toString());
		}
//		for(int i = 0; i < stdList.size(); i++) {
//			System.out.println(stdList.get(i).toString());
//		}
	}
	public void checkPass() {
		System.out.println("========= 재시험 여부 확인 ==========");
		for(Student student : stdList) {
			System.out.println(student.getName() + "학생의 확인 결과");
			if(!student.passExam1()) {
				System.out.println("1차 시험 재평가 대상입니다.");
			}
			if(!student.passExam2()) {
				System.out.println("2차 시험 재평가 대상입니다.");
			}
			if(student.passExam1() && student.passExam2()) {
				System.out.println("1, 2차 모두 통과입니다.");
			}
			System.out.println("---------------------------------");
		}
	}
	public void searchInfoByName() {
		System.out.println("======== 학생 정보 이름 검색 =========");
		System.out.print("학생 이름 : ");
		String searchName = sc.next();
		for(Student std : stdList) {
			if(std.getName().equals(searchName)) {
				System.out.println(std.toString());
				break;
			}
		}
	}
}
