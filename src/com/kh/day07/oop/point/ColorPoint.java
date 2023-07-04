package com.kh.day07.oop.point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {
		super(); // 부모의 기본생성자를 호출 -> Point()실행 -> ColorPoint()실행 -> 객체 생성됨
	}
	
	public ColorPoint(int x, int y, String color) {
//		super.x = x;
//		super.y = y; // x, y는 private이므로 접근 불가
		super(x, y); // 부모클래스의 생성자 메소드를 통해 초기화
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		super.showPoint(); // 부모클래스에서 가져옴
	}
}

