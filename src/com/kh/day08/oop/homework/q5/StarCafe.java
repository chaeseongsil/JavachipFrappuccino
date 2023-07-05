package com.kh.day08.oop.homework.q5;

public class StarCafe extends Cafe{
	String cafeName = "별다방";
	static int starAds = 0;
	@Override
	public void makeCoffee(int money) {
		if(money == Menu.STARA_MERICANO) {
			System.out.println(cafeName + " : 아메리카노 준비해드리겠습니다.");
			starAds += money;
		}else if(money == Menu.STAR_LATTE) {
			System.out.println(cafeName + " : 라떼 준비해드리겠습니다.");
			starAds += money;
		}else {
			System.out.println(cafeName + " : 금액이 더 필요합니다.");
		}
	}
	public int getAds() {
		return starAds;
	}
}
