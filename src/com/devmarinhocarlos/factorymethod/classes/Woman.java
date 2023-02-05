package com.devmarinhocarlos.factorymethod.classes;

public class Woman extends Person{
	final String GENDER = "Fermale";

	@Override
	public String toString() {
		return "Woman [GENDER=" + GENDER + ", name=" + name + ", age=" + age + "]";
	}
	
}
