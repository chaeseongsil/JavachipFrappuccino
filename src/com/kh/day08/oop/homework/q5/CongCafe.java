package com.kh.day08.oop.homework.q5;

public class CongCafe extends Cafe {
	String cafeName = "콩다방";
	static int congAds = 0;
//	public CongCafe() {
//		super.setCafeName(cafeName);
//	}
	@Override
	public void makeCoffee(int money) {
		if(money == Menu.CONG_AMERICANO) {
			System.out.println(cafeName + " : 아메리카노 준비해드리겠습니다.");
			congAds += money;
		}else if(money == Menu.CONG_LATTE) {
			System.out.println(cafeName + " : 라떼 준비해드리겠습니다.");
			congAds += money;
		}else {
			System.out.println(cafeName + " : 금액이 더 필요합니다.");
		}
	}
	public int getAds() {
		return congAds;
	}
}
