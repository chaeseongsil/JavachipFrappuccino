package com.kh.day08.oop.interfacepkg;

public interface PhoneInterface {
	// 1. Illegal modifier for the interface field PhoneInterface.name; 
	// only public, static & final are permitted
	// -> interface는 private 사용불가
	// 2. Illegal modifier for the interface field PhoneInterface.name; only public, static & final are permitted
	// -> 초기화 필요
	public static final String NAME = "";
	public static final int TIME_OUT = 10000;
	
	public abstract void receiveCall();
	void sendCall(); // public abstract 생략 가능
	abstract void printLogo(); // public 생략 가능
	// Abstract methods do not specify a body
	// -> {} 없애기
	public default void showLogo() {
		// default 메소드
		// 하위 호환성을 위해서 작성함.
		// 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("*** LG ***");
	}
	
	
}
