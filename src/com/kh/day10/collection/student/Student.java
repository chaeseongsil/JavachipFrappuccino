package com.kh.day10.collection.student;

public class Student {
	// 이름
	// 점수1
	// 점수2
	private String name;
	private int score1;
	private int score2;
	
	public Student() {}
	public Student(String name, int score1, int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	// getter
	// 매개변수 x, 반환형 o
	public String getName() {
		return this.name;
	}
	public int getScore1() {
		return this.score1;
	}
	public int getScore2() {
		return this.score2;
	}
	// setter
	// 매개변수 o, 반환형 x
	public void setName(String name) {
		this.name = name;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	public void setScore2(int score2) {
		this.score2 = score2;
	}
	@Override
	public String toString() {
		return "name : " + this.name + ", score1 : " + this.score1 +
				", score2 : " + this.score2;
	}
	public Boolean passExam1() {
		double avg = (this.score1 + this.score2) / 2;
		if(this.score1 < 40) {
			return false;
		}else if (avg < 60 && this.score1 < 60) {
			return false;
		}else {
			return true;
		}
	}
	public Boolean passExam2() {
		double avg = (this.score1 + this.score2) / 2;
		if(this.score2 < 40) {
			return false;
		}else if (avg < 60 && this.score2 < 60) {
			return false;
		}else {
			return true;
		}
	}
	
	@Override
	public int hashCode() {
		return (this.name + this.score1 + this.score2).hashCode();
		// 세 가지 멤버변수를 합하여 해시코드를 출력할 수 있도록 재정의함
		// -> equlas에서 해시코드로 값을 비교할 수 있도록 함 
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj; // 다운캐스팅
			return this.hashCode() == std.hashCode();
		}else {
			return false;			
		}
	}
}
