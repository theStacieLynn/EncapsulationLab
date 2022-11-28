package com.ruiz.encapsulation;

public class HumanBeing {
	private double weight;
	private double height;
	private double bmi;
	
	public HumanBeing(double weight, double height, double bmi) {
		this.weight = weight;
		this.height = height;
		this.bmi = bmi;
	}

	public HumanBeing() {
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	@Override
	public String toString() {
		return "HumanBeing [weight=" + weight + ", height=" + height + ", bmi=" + bmi + "]";
	}
	
	
	
}
