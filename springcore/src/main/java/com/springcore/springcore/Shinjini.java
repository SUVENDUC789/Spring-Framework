package com.springcore.springcore;

public class Shinjini {

	private String clg;
	private String name;

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shinjini() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shinjini(String clg, String name) {
		super();
		this.clg = clg;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shinjini [clg=" + clg + ", name=" + name + "]";
	}

}
