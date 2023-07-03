package com.kh.day03.array.exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Exercise_ArrayPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		int [] arrs = new int [10];
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = i+1;
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
	public void practice2() {
		int [] arrs = new int [10];
		for(int i = 0; i < arrs.length; i++) {
			arrs[arrs.length-i-1] = i+1; 
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int [] arrs = new int[input];
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = i + 1;
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
 	}
	public void practice4() {
		String [] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruits[1]);
	}
	public void practice5() {
		System.out.print("문자열 : ");
		String inputs = sc.next();
		char [] inputArrs = new char[inputs.length()];
		for(int i = 0; i < inputArrs.length; i++) {
			inputArrs[i] = inputs.charAt(i);
		}
		System.out.print("문자 : ");
		char searchChar = sc.next().charAt(0);
		int count = 0;
		System.out.print(inputs + "에 " + searchChar + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < inputArrs.length; i++) {
			if(inputArrs[i] == searchChar) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n" + searchChar + " 개수 : " + count);
	}
	public void practice6() {
		String [] dayArrs = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int dayNum = sc.nextInt();
		if(dayNum < 0 || dayNum > 6) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(dayArrs[dayNum] + "요일");			
		}	
	}
	public void practice7() {
		System.out.print("정수 : ");
		int lengthVal = sc.nextInt();
		int [] arrs = new int[lengthVal];
		int sum = 0;
		for(int i = 0; i < arrs.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int input = sc.nextInt();
			arrs[i] = input;
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
			sum += arrs[i];
		}
		System.out.println("\n총 합 : " + sum);
	}
	public void practice8() {
		for(;;) {
			System.out.print("3이상의 홀수를 입력하세요. : ");
			int num = sc.nextInt();
			if(num % 2 != 1 || num < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			}else {
				int [] arrs = new int[num];
				for(int i = 0; i <= arrs.length/2; i++) {
					arrs[i] = i+1;
				}
				for(int i = arrs.length/2 + 1; i < arrs.length; i++) {
					arrs[i] = arrs[i-1] - 1;
				}
				for(int i = 0; i < arrs.length; i++) {
					System.out.print(arrs[i] + " ");
				}
				break;
			}
		}
	}
	public void practice9() {
		String [] chickenMenu = {"양념", "뿌링클", "파닭", "후라이드", "허니콤보"};
		System.out.print("치킨 이름을 입력하세요. : ");
		String input = sc.next();
		int count = 0;
		for(int i = 0; i < chickenMenu.length; i++) {
			if(input.equals(chickenMenu[i])) {
				count++;
			}
		}
		if(count == 1 ) {
			System.out.println(input + "치킨 배달 가능!");
		}else {
			System.out.println(input + "치킨은 없는 메뉴입니다.");			
		}
	}
	public void practice10() {
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
	public void practice11() {
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
	public void practice12() {
		System.out.print("문자열 : ");
		String input = sc.next();
		String [] arrs = input.split("");
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(Arrays.asList(arrs));
		String[] resultArr = linkedHashSet.toArray(new String[0]);
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < resultArr.length; i++) {
			System.out.print(resultArr[i]);			
			if(i != resultArr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("\n문자 개수 : " + resultArr.length);
	}
}
