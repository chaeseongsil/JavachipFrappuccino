package com.kh.day03.array.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Array1 {
	public void exercise1() {
		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라
		Scanner sc = new Scanner(System.in);
		int [] nums = new int[5];
		int maxVal = 0;
		System.out.print("양수 5개를 입력하세요. : ");
		for(int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			maxVal = (nums[i] > maxVal) ? nums[i] : maxVal;
		}
		System.out.println("가장 큰 수 : " + maxVal);		
	}
	public void exercise2() {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 
		// 평균을 구하는 프로그램을 작성하라.
		int [] numArrs = new int[5];
		System.out.println("정수를 " + numArrs.length + "개 입력해주세요. : ");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i < numArrs.length; i++) {
			numArrs[i] = sc.nextInt();
			sum += numArrs[i];
		}
		System.out.println("평균 : " + (double)sum / numArrs.length);
	}
	public void arrayCopyExercise() {
		// 사용자에게 주민번호를 입력받은 후
		// 성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오.
		// 230515-1231514 -> 230515-1*******
		// 231026-1231515 -> 231026-1*******
		Scanner sc = new Scanner(System.in);
		char [] origin = new char[14];
		System.out.print("주민번호를 입력하세요. : ");
		String memberNum = sc.next();
		for(int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
		}
		
		char [] copy = new char[14]; // 깊은 복사의 시작
		for(int j = 0; j < origin.length; j++) {
			if(j < 8) {
				copy[j] = origin[j]; // 성별자리 전까지 차례대로 값을 대입
			}else {
				copy[j] = '*'; // 성별자리 이후엔 *로 값 대입
			}
			System.out.print(copy[j]);
		}
	}
	
	public void lottoExercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		Random rand = new Random();
		int [] lotto = new int[6];
		int temp;
		for(int i = 0; i < lotto.length; i++) { // 로또번호 생성
			lotto[i] = rand.nextInt(45) + 1;
			for(int j = 0; j < i; j++) { // 중복검사
				if(lotto[j] == lotto[i]) {
					lotto[i] = rand.nextInt(45) + 1;
				}
			}
		}
		for(int i = 0; i < lotto.length-1; i++) {
			for(int j = 0; j < (lotto.length-1)-i; j++) {
				if(lotto[j] > lotto[j+1]) {
					temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
