package com.kh.day03.array;

public class Exam_Array {
	public static void main(String [] args)
	{
		int num; // 변수 선언
		num = 0; // 변수 초기화
		// int num = 0;
		int nums []; // int [] nums; 배열 선언
		nums = new int[10]; // 배열 할당
		// nums는 배열의 주소이다. 
		// []는 연산이고 숫자가 들어가서 1칸씩 이동하여 값을 가져온다.
		nums[0] = 2; // 값 초기화
		System.out.println(nums[0]);
		System.out.println("배열의 크기 : " + nums.length);
		// 배열 할당 후 값 초기화를 하지 않으면 자료형의 기본값이 들어감
		// int의 기본값 : 0, String의 기본값 : null => 데이터가 없음을 나타냄
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		// 레퍼런스 변수 = 참조변수 -> 데이터의 주소를 저장함
		// String -> 문자열의 주소를 저장하는 참조변수
		// 나머지 데이터 타입 : 기본형 -> 실제 값이 저장됨
	}
}
