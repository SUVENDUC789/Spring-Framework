package com.springcore.springcore;

public class Suvendu {

	private int roll;
	private String name;
	private String clg;
	private Shinjini crush;

	public Suvendu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Suvendu(int roll, String name, String clg, Shinjini crush) {
		super();
		this.roll = roll;
		this.name = name;
		this.clg = clg;
		this.crush = crush;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	public Shinjini getCrush() {
		return crush;
	}

	public void setCrush(Shinjini crush) {
		this.crush = crush;
	}

	@Override
	public String toString() {
		return "Suvendu [roll=" + roll + ", name=" + name + ", clg=" + clg + ", crush=" + crush + "]";
	}

}
