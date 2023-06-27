package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args)
	{
		// 구구단 출력
		// 2단 옆에 3단, 3단 옆에 4단, ... 되도록 출력
		for(int k = 1; k < 10; k++){
			for(int h = 2; h < 10; h++) {
				System.out.print(h + " * " + k + " = " + h*k + "\t");		
				// \t 사용하면 일정한 간격으로 띄워줌
			}			
			System.out.println();
		}
	}
}
