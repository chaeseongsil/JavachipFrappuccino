package com.kh.day08.oop.interfacepkg;

public class Exam_Interface {

	public static void main(String[] args) {
		// PhoneInterface phone = new PhoneInterface();
		// 1. Cannot instantiate the type PhoneInterface
		// interface는 객체 생성 대상이 아님
		PhoneInterface phone = new SamsungPhone(); // 업캐스팅
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
		
	}

}
