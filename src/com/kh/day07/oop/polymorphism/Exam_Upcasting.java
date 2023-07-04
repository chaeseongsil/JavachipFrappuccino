package com.kh.day07.oop.polymorphism;

public class Exam_Upcasting {
	public static void main(String[] args) {
		Student std = new Student();
		Person p = new Person();
		
		Person parent = new Student("일용자"); // 가능
		System.out.println(parent.name);
		// parent 는 결국 Person 타입의 객체이기 때문에 Student만 가지고 있는 필드에는 접근이 불가함
		System.out.println(parent.id);
		System.out.println(((Student)parent).grade); // 다운캐스팅
		System.out.println(((Student)parent).department);
	}
}
