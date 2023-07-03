package com.kh.day06.oop.objectarray;

public class Exam_ObjectArray {
	public static void main(String [] args)
	{
//		Circle c = new Circle(); 
//		c.radius = 10;
//		double result = c.getArea();
//		System.out.println(result);
		Circle [] cArray;
		cArray = new Circle[5];
		// Circle c = cArray[0];
		System.out.println(cArray[0]); // null, 아직 객체가 아닌 공간 자체이기 때문에 null이 출력됨
//		cArray[0].radius = 10; // 객체가 아니기 때문에 NullPointerException 오류 발생함
		cArray[0] = new Circle(); // 공간에 객체 생성
		System.out.println(cArray[0]); // com.kh.day06.oop.objectarray.Circle@626b2d4a
		cArray[0].radius = 10; // 객체로 생성했기 때문에 값 할당 가능
		System.out.println(cArray[0].getArea());
		
		for(int i = 0; i < cArray.length; i++) {
			cArray[i] = new Circle(); // 이 때 주소를 가리키는 화살표가 생기는 것!
		}
		cArray[0].radius = 1;
		cArray[1].radius = 2;
		cArray[2].radius = 3;
		cArray[3].radius = 4;
		cArray[4].radius = 5;
		
		System.out.println(cArray[0].getArea());
		System.out.println(cArray[1].getArea());
		System.out.println(cArray[2].getArea());
		System.out.println(cArray[3].getArea());
		System.out.println(cArray[4].getArea());
	}
}
