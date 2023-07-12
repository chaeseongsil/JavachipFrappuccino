package com.kh.day13.swing.basic;

import javax.swing.JFrame;

public class Exam_MyFrame extends JFrame{
	
	public Exam_MyFrame() { // 스윙은 생성자가 필요함
		setTitle("300x300 스윙 프레임 만들기"); // 창의 이름
		setSize(300, 300); // 창의 크기
		setVisible(true); // JFrame을 상속받음으로써 동작함
	}
	
	public static void main(String[] args) { 
		// main을 프레임 클래스 내의 멤버로 사용하는 것을 권장함
		Exam_MyFrame exFrame = new Exam_MyFrame(); // 참조변수에 생성한 객체의 주소를 담음
		// 참조변수 없이 선언해도 생성은 됨, 재사용하기 위해 참조변수를 사용
		
	}

}
