package com.devmarinhocarlos.factorymethod.generate;

import com.devmarinhocarlos.factorymethod.classes.Person;
import com.devmarinhocarlos.factorymethod.factories.FactoryMethod;

public class Main {

	public static void main(String[] args) {
		FactoryMethod factory = new FactoryMethod();
		
		Person fermalePerson = factory.factoryMethod("F");
		System.out.println(fermalePerson);
		
		Person malePerson = factory.factoryMethod("M");
		System.out.println(malePerson);
	}

}
