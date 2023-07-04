package com.kh.day07.oop.member;

import java.util.Scanner;

import com.kh.day06.oop.student.Student;

public class MemberRun {
	public static void main(String[] args) {
		MemberFunction mFunc = new MemberFunction();
		Member [] memArrs = new Member[3];
		finish : 
		while(true) {
			int choice = mFunc.printMenu();
			switch(choice) {
			case 1 : 
				mFunc.inputInfo();
				break;
			case 2 :
				mFunc.printInfo();
				break;
			case 3 :
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
			default:
				System.out.println("해당 메뉴는 존재하지 않습니다.");
			}
		}
	}
}
