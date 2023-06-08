package com.constructorInjection.Constructor_Injection;

public class Example {

	private int x;
	private int y;

	public Example(double x, double y) {
		this.x = (int) x;
		this.y = (int) y;
		System.out.println("constructor : double , double");
	}

	public Example(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("constructor : int , int");
	}

	public Example(String x, String y) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
		System.out.println("constructor : String , String");
	}

	public void doSum() {
		System.out.println("Result : " + (this.x + this.y));
	}

}
