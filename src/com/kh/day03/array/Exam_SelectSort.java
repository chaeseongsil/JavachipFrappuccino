package com.kh.day03.array;

public class Exam_SelectSort {
	public static void main(String[] args) {
		// 선택정렬이란?
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽으로부터 채워나가는 정렬 알고리즘
		// 특징 : 데이터 양이 적을 때 좋은 성능을 보여주는 정렬이지만
		// 데이터 양이 많을 때 급격한 성능 저하를 보임.
		// 배열의 n번 인덱스 값을 n+1번 ~ 마지막 인덱스까지 비교함
//		 {2, 5, 4, 1, 3}
//		 첫번째 : {1, 5, 4, 2, 3}
//		 두번째 : {1, 2, 4, 5, 3}
//		 세번째 : {1, 2, 3, 5, 4}
//		 네번째 : {1, 2, 3, 4, 5}
		// 1. 최소값을 구하는 방법으로
		// 2. 배열의 값을 교환.
		// 3. min값은 최소값이 아니라 인덱스 값을 저장해야함
		// 4. 최소값을 찾는 범위가 시작은 1이 되고 점점 증가해야함.
		// 바꿔야 하는 자리는 0부터 시작해서 1씩 증가해야함.
		// 5. 만족하는 변수를 선언하여 1씩 증가하는 for문 작성 후 코드를 이동

		int[] arrs = { 2, 5, 4, 1, 3 };
		int min = 0;

		for (int j = 0; j < arrs.length-1; j++) {
			min = j;
			for (int i = j + 1; i < arrs.length; i++) {
				if (arrs[min] > arrs[i]) {
					min = i;
				}
			}
			int temp = arrs[j];
			arrs[j] = arrs[min];
			arrs[min] = temp;
		}
//		int [] arrs = {99,77,66,44,88,33,22,68};
//		int min = 0; // min은 최소값 저장하면 안되고 최소인 인덱스 값을 저장해야함.
//		for(int j = 0; j < arrs.length-1; j++) { //바꿀 자리
//			min = j;
//			for(int i = j+1; i < arrs.length; i++) { //최소값 찾기
//				min = arrs[min] > arrs[i] ? i : min;
//			}
//			int temp = arrs[j];
//			arrs[j] = arrs[min];
//			arrs[min] = temp;
//		}
		// 배열 출력
		for (int k = 0; k < arrs.length; k++) {
			System.out.print(arrs[k] + " ");
		}
		
		// ctrl + shift+ f => 자동 들여쓰기
	}
}
