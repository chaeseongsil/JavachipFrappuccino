package com.kh.day08.oop.interfacepkg;

public class SamsungPhone implements PhoneInterface{
	// 1. extends 사용시 -> 
	// The type PhoneInterface cannot be the superclass of SamsungPhone; a superclass must be a class
	// extends는 클래스를 상속받을때만 사용가능
	// Interface를 상속받을 때는 implements 사용!!
	
	// 2. The type SamsungPhone must implement the inherited abstract method PhoneInterface.receiveCall()
	// Interface가 가지고 있는 추상메소드들을 모두 오버라이딩 해야함
	
	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야~");
	}

	@Override
	public void sendCall() {
		System.out.println("따르릉 따르릉");
	}

	@Override
	public void printLogo() {
		System.out.println("===***=== SAMSUNG ===***===");
	}
}
