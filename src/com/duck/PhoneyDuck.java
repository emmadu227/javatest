package com.duck;

public class PhoneyDuck extends Duck{
	public PhoneyDuck() {
		flyb = new FlyNoWay();
		quackb = new QuackNoWay();
	}
}
