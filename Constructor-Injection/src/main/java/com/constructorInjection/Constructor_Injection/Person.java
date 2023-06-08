package com.constructorInjection.Constructor_Injection;

public class Person {

	private String gender;
	private String crush;

	public Person(String gender, String crush) {
		super();
		this.gender = gender;
		this.crush = crush;
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", crush=" + crush + "]";
	}

}
