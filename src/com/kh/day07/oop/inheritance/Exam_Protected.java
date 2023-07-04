package com.kh.day07.oop.inheritance;

import com.kh.day07.oop.point.Point;

class Parent {
	public int pub;
	int def;
	protected int pro;
	private int pri;
	
	public Parent() {}
	
	
}

class Child extends Parent {
	private int childMoney;
	public Child() {}
	void set() {
		super.pub = 1;
		super.def = 2;
		super.pro = 3;
//		super.pri = 4; // The field Parent.pri is not visible
	}
}

class shapePoint extends Point {
	private String shape;
	public shapePoint() {}
	void set() {
		super.pub = 1;
//		super.def = 2; // default는 다른패키지에 있는 값을 가져올 수 없다. The field Point.def is not visible
		super.pro = 3; // protected는 다른패키지에 있어도 상속관계이면 접근 가능
//		super.pri = 4; // The field Point.pri is not visible // private은 당연히 접근불가
	}
}

public class Exam_Protected {
	public static void main(String[] args) {
		
	}
}
