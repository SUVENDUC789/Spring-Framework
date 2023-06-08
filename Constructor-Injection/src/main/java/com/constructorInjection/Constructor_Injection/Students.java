package com.constructorInjection.Constructor_Injection;

public class Students {

	private int roll;
	private String name;
	private Person p;

	public Students(int roll, String name, Person p) {
		super();
		this.roll = roll;
		this.name = name;
		this.p = p;
	}

	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", p=" + p + "]";
	}

}
