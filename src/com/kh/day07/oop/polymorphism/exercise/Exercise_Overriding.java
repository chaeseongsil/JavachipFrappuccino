package com.kh.day07.oop.polymorphism.exercise;
class SuperClass {
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super Object");
	}
}

class SubClass extends SuperClass {
	void paint() {
		super.paint();
		super.draw();
	}
	void draw() {
		System.out.println("Sub Object");
	}
}
public class Exercise_Overriding {
	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}

}

/* 
1. ex는 SubClass 타입
2. ex.paint() 하면 SubClass의 paint() 가 호출됨
3. super.paint() -> super로 가서 draw()를 만남
4. SubClass에 Overriding된 draw()실행
5. super.draw() -> super클래스의 draw()로 직행 
 */