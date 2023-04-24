package com.hello;

public class Students {
	
	private int roll;
	private String name;
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		System.out.println("Roll set...");
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		System.out.println("Roll name...");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + "]";
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}	

}
