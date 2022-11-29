package com.ruiz.encapsulation;

public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanBeing h1= new HumanBeing();
		
		h1.setHeight(1.65);
		h1.setWeight(68);
		h1.setBmi(calculateBmi(h1));
		
		System.out.println("Person has "+h1.getWeight()+" kgs and is "+ h1.getHeight()+
				"\n meters in height, which results in BMI of "+h1.getBmi());
	}
	
	public static double calculateBmi(HumanBeing h1) {
		return h1.getWeight()/(h1.getHeight()*h1.getHeight());
	}
}
