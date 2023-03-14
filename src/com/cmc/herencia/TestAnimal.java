package com.cmc.herencia;

public class TestAnimal {

	public static void main(String[] args) {
		Perro perro = new Perro();
		perro.dormir();
		perro.ladrar();
		System.out.println(perro.hashCode());

	}

}
