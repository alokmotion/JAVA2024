package com.learn.Inheritance.Animal;

public class Animal {
	String animalSound = "Animal Sound";
	
	public void makeSound() {
		System.out.println("Animal is making " + animalSound);
	}

}



class Tiger extends Animal{
	String tigerSound = "tiger sound";
	
	public void makeSound() {
		System.out.println("Animal is making " + tigerSound);
	}
	
	public void animalParentMethod() {
		super.makeSound();
	}
}


