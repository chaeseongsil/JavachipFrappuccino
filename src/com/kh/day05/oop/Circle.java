package com.kh.day05.oop;

public class Circle {
	public int radius; // 원의 반지름
	public String name; // 원의 이름
	// =============================> 필드

	public Circle() { // 생성자(기본)
		// 초기화
		radius = 1;
		name = "아무개"; // 필드에 값을 넣음 -> 객체 초기화
	}
	// 매개변수가 있는 생성자
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	// =============================> 생성자
	// 생성자의 역할은 객체를 초기화해줌
	// 생성자는 반환할 값이 없고 void가 없는 유일한 메소드
	// => 생성자는 객체를 초기화하고 반환형이 없으며 클래스 이름과 동일하다.
	// 기본 생성자는 생략이 가능하다.
	
	public double getArea() { // 원의 넓이를 구해주는 메소드
		return 3.14*radius*radius;
	}
	// =============================> 메소드
	
	public static void main(String [] args) { 
		// 클래스 안에 메인 메소드를 넣어 바로 실행 가능
		Circle pizza;
		pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "청년피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
	}
}
