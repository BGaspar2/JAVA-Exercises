package com.cmc.herencia;

public class Perro extends Animal{
	public void ladrar(){
		System.out.println("Perro ladrando");
	}
	
	//public void dormir(){
	//System.out.println("Animal durmiendo");
	//}
	
	public void dormir(){
		super.dormir();
		System.out.println("PERRO durmiendo");
	}
	

}
