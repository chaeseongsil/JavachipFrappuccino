package com.kh.day08.oop.homework.q5;

public class Run {
	public static void main(String[] args) {
		Person kim = new Person("김씨", 100000);
		kim.buyCoffee(new StarCafe(), 5500);
		kim.printInfo();
		Person lee = new Person("이씨", 10000);
		lee.buyCoffee(new CongCafe(), 4500);
		Person son = new Person("손씨", 20000);
		son.buyCoffee(new CongCafe(), 4000);
		System.out.println("별다방 누적 판매금액 : " + new StarCafe().getAds());
		System.out.println("콩다방 누적 판매금액 : " + new CongCafe().getAds());
		
	}
}
