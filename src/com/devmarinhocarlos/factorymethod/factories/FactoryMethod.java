package com.devmarinhocarlos.factorymethod.factories;

import com.devmarinhocarlos.factorymethod.classes.Man;
import com.devmarinhocarlos.factorymethod.classes.Person;
import com.devmarinhocarlos.factorymethod.classes.Woman;

public class FactoryMethod {
	public Person factoryMethod(String gender) {
		if(gender.equalsIgnoreCase("M")) {
			return new Man();
		}
		else if(gender.equalsIgnoreCase("F") ) {
			return new Woman();
		}
		return null;
	}
}
