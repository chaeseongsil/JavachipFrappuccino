package com.kh.day08.oop.interfacepkg.zoo;

public class Tiger extends Animal implements FoodInterface{
	@Override
	public String animalFood() {
		return "beef";
	}
	@Override
	public String makeSound() {
		return "어흥";
	}
}
