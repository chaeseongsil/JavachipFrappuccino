package com.kh.day06.oop.student;

public class Student {
	// 이름
	// 첫번째 성적
	// 두번째 성적
	// 평균 출력
	private String name;
	private int score1;
	private int score2;
	
	public Student() {
		name = "";
		score1 = 0;
		score2 = 0;
	}
	public Student(String name, int score1, int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	
	public double getAvg() {
		double result = (double)(score1 + score2) / 2;
		return result;
	}
	
	public boolean reExamYN1() {
		if(score1 < 40) {
			return false;
		}else if(this.getAvg() < 60 && score1 < 60) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean reExamYN2() {
		if(score2 < 40) {
			return false;
		}else if(this.getAvg() < 60 && score2 < 60) {
			return false;
		}else {
			return true;
		}
	}
	// getter 메소드
	public String getName() {
		return this.name;
	}
	
	public int getScore1() {
		return this.score1;
	}
	
	public int getScore2() {
		return this.score2;
	}
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	
	public void setScore2(int score2) {
		this.score2 = score2;
	}
}
