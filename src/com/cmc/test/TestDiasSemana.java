package com.cmc.test;

import com.cmc.estaticos.DiasSemana;
import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.System.out;

public class TestDiasSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiasSemana ds = new DiasSemana();
		int valor = ds.MARTES;
		out.println(valor);
		valor = DiasSemana.MIERCOLES;
		out.println(valor);
		
		double d1 = PI;
		out.println(d1);
		double d2 = random();
		out.println(d2);
	}

}
