package com.kh.day05.oop;

class StaticSample {
	public int num;
	
	public static int input;
	
	public void sampleMethod() {
		
	}
	public void goodMethod() {
		
	}
	public static void originMethod() {
		input = 1225;
	}
}

public class Exam_Static {
	public static void main(String [] args) 
	{
		StaticSample.input = 10;
		// static 으로 선언한 변수는 new로 생성하지 않아도 바로 사용 가능
		StaticSample.originMethod();
		System.out.println(StaticSample.input);
		// 메모리 : stack(정적 할당), heap(동적 할당), static(jvm이 실행되자마자 바로 할당)
		// sample -> stack, new StaticSample() -> heap, input -> static
		StaticSample sample = new StaticSample();
		sample.num = 26;
	}
}
