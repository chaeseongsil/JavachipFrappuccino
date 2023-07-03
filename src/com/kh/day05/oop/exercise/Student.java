package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Student {
	static String name;
	static int kor;
	static int eng;
	static int math;
	static int sum;

	static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 성적 입력 ======");
		System.out.print("국어 : ");
		Student.kor = sc.nextInt();
		Student.sum += Student.kor;
		System.out.print("영어 : ");
		Student.eng = sc.nextInt();
		Student.sum += Student.eng;
		System.out.print("수학 : ");
		Student.math = sc.nextInt();
		Student.sum += Student.math;
	}
	static void printScore() {
		
		System.out.println("====== 성적 출력 =======");
		Student.printStudentScore();
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", ((double)sum / 3));
		System.out.println();
		sum = 0;
	}
	static void printStudentScore() {
		System.out.printf("국어 : %d\n", Student.kor);
		System.out.printf("영어 : %d\n", Student.eng);
		System.out.printf("수학 : %d\n", Student.math);
	}
}
