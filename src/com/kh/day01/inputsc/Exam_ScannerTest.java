package com.kh.day01.inputsc;

import java.io.IOException;
import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main(String [] args) throws Exception
	{
//		System.out.println("가이드 메시지");
//		System.out.println(System.in.read()); // 입력하면 ASCII code 값으로 변환됨
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("가이드 메시지 : ");
//		int input = sc.nextInt();
//		System.out.println(input);
		
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("이름을 입력하세요 : ");
		String name = sc.next(); // 문자열 읽기
		
		//System.out.print("도시를 입력하세요 : ");
		String city = sc.next();
		
		//System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		//System.out.print("체중을 입력하세요 : ");
		double weight = sc.nextDouble();
		
		//System.out.print("싱글입니까? : ");
		boolean singleYN = sc.nextBoolean();
		
		//문장처럼 한 줄로 출력하기
		System.out.println("이름은 " + name + ", 도시는 " + city + ", 나이는 " + age + "살, 체중은 " + weight + "kg, 싱글여부는 " + singleYN + "입니다." );
		
		// 한줄씩 출력하기
//		System.out.println("이름 : " + name);
//		System.out.println("도시 : " + city);
//		System.out.println("나이 : " + age);
//		System.out.println("체중 : " + weight);
//		System.out.println("싱글여부 : " + singleYN);
		
	}
}
