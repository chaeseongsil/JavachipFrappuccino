package com.kh.day08.oop.homework.q6;

public class Card {
	// 소유자 이름
	// 카드번호
	// 유효기간
	// CVC
	// 비밀번호
	int cardNumber;
	static int serialNum = 10000;
	// 시리얼넘버를 static으로 선언하지 않으면 Card가 생성될 때마다 초기화됨
	// static으로 선언해서 모든 클래스가 공유하는 전역변수처럼 만들어줘야 증가된 값이 저장됨
	public Card() {
		cardNumber = serialNum;
		serialNum++;
	}
	
	public void printCardInfo() {
		System.out.println(this.cardNumber + "입니다.");
	}
}
