package com.kh.day05.run;

import java.util.Scanner;

import com.kh.day05.oop.Book;
import com.kh.day05.oop.Circle;
import com.kh.day05.oop.exercise.Rectangle;

public class Run {
	public static void main(String [] args)
	{
		
//		Book littlePrince = new Book();
//		littlePrince.title = "어린왕자";
//		littlePrince.author = "생텍쥐페리";
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향뎐");
		
		System.out.println(littlePrince.title + ", " + littlePrince.author);
		// Book 클래스의 변수를 default로 선언하면 이곳에서 참조할 수 없음
		// The field Book.title is not visible
		System.out.println(loveStory.title + ", " + loveStory.author);
		
		
		Rectangle input = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 너비(㎝)를 입력하세요. : ");
		input.width = sc.nextInt();
		System.out.print("사각형의 높이(㎝)를 입력하세요. : ");
		input.height = sc.nextInt();
		int result = input.getArea();
		System.out.println("사각형의 면적은 " + result + "㎠ 입니다.");
		
		Circle pizza;
//		pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "청년피자";
		pizza = new Circle(10, "청년피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
//		Circle donut = new Circle();
//		donut.radius = 2;
//		donut.name = "청년도넛";
		Circle donut = new Circle(2, "청년도넛");
		area = donut.getArea();
		System.out.printf("%s의 면적은 %.2f", donut.name, area);
		
//		Circle circle = new Circle(); // circle이라는 이름의 참조변수로 Circle 클래스 생성
//		Circle circle2 = new Circle();
//		Circle circle3 = new Circle();
//		Circle circle4 = new Circle();
//		
//		circle.radius = 1;
//		circle2.radius = 2;
//		circle3.radius = 3;
//		
//		System.out.println(circle.getArea());
//		System.out.println(circle2.getArea());
//		System.out.println(circle3.getArea());
	}
}
