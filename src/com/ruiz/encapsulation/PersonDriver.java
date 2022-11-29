package com.ruiz.encapsulation;

public class PersonDriver {

	public static void main(String[] args) {
		// Use empty constructor
		Person megatron = new Person();
		megatron.setName(" Megatron ");
		megatron.setAge(246);
		megatron.setCompany("Evil transformers.us");
		megatron.setJob("Meany");
		megatron.setHobby("knit");
		megatron.talkAboutYourself();
		
		//using constructor with parameters 
		Person bumblebee = new Person("Bumblebee",123,"Target","Cashier","hopscotch");
		bumblebee.talkAboutYourself();
	}

}
