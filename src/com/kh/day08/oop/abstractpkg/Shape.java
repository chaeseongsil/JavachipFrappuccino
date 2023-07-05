package com.kh.day08.oop.abstractpkg;
class Line extends Shape {
	// 4. The type Line must implement the inherited abstract method Shape.draw()
	// -> 추상메소드 draw를 오버라이딩 하기 or 클래스 앞에 abstract 붙이기
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
public abstract class Shape {
	
	public Shape() {}
	
	public void paint() {}
	
	abstract public void draw();
	// 1. Abstract methods do not specify a body
	// -> 추상메소드는 {} 가 있으면 안됨. ; 으로 마무리
	// 2. The abstract method draw in type Shape can only be defined by an abstract class
	// -> 추상메소드가 있으면 클래스는 추상클래스여야 함. 클래스에 abstract 추가
	// 3. The type Shape must be an abstract class to define abstract methods
	// -> 클래스에 뜨는 오류메시지, abstract 적용
}
