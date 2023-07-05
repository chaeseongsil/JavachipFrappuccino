package com.kh.day08.oop.homework.q5;

import java.util.HashMap;

public abstract class Cafe {
	private String cafeName;
	public Cafe() {
		cafeName = "";
	}
	
	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}
	
	abstract public void makeCoffee(int money);
	
	public void setCafeName(String name) {
		this.cafeName = name;
	}




}
