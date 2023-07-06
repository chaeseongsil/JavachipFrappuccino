package com.kh.day08.oop.interfacepkg.zoo;

public class ZooKeeper {
	public void feed(FoodInterface predator) {
		System.out.println("feed " + predator.animalFood());
		System.out.println("맛있니? " + predator.makeSound() );
	}
	
	public static void main(String[] args) {
		ZooKeeper zk = new ZooKeeper();
		zk.feed(new Bear());
		zk.feed(new Tiger());
		zk.feed(new Lion());
	}
}
