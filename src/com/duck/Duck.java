package com.duck;

public class Duck {
	FlyBehavior flyb;
	QuackBehavior quackb;
	
	public Duck() {
		
	}
	
	public void performFly() {
		flyb.fly();
	}
	
	public void performQuack() {
		quackb.quack();
	}
}
