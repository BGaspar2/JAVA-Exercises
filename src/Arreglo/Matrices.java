package Arreglo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Matrices {

	public static void main(String[] args) {
		/*int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};


		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}*/
		Scanner sc = new Scanner (System.in);
		int matriz[][], nFilas, nColumnas;
		nFilas = Integer.parseInt(JOptionPane.showInputDialog("Numero de filas: "));
		nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Numero de columnas: "));

		matriz = new int [nFilas][nColumnas];
		if(nFilas == nColumnas) {
		System.out.println("MATRIZ");
		for(int i = 0; i < nFilas; i++) {
			for(int j = 0; j < nColumnas; j++) {

				System.out.println("Matriz[" + (i+1) + "][" + (j+1) + "] = ");
				matriz[i][j] = sc.nextInt();

			}

		}

			boolean x = true;
			for(int i = 0; i < nFilas; i++) {
				for(int j = 0; j < nColumnas; j++) {
					if(matriz[i][j] != matriz[j][i]) {
						x = false;
					}
				}

			}
			if (x == true)
				System.out.println("Es simetrica");
			else
				System.out.println("No es simetrica");
		/*for(int i = 0; i < nFilas; i++) {
			for(int j = 0; j < nColumnas; j++) {

				System.out.print(matriz[i][j] + " ");

			}
			System.out.println();

		}*/
		} else
			System.out.println("No es simetrica, porque el numero de filas no es igual al numero de columnas");
	}

}
