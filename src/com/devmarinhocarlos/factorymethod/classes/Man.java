package com.devmarinhocarlos.factorymethod.classes;

public class Man extends Person {
	final String GENDER = "Male";

	@Override
	public String toString() {
		return "Man [GENDER=" + GENDER + ", name=" + name + ", age=" + age + "]";
	}
	
}
