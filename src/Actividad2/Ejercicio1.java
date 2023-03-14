/* Construir un programa que simule el funcionamiento de una calculadora
 *  que puede realizar las cuatro operaciones aritméticas básicas 
 *  (suma, resta, producto y división) con valores numéricos. 
 *  El usuario debe especificar la operación con el primer carácter: 
 *  S o s para la suma, R o r para la resta, P o p para el producto y 
 *  D o d para la división.
 */

package Actividad2;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		 char operacion=0;
		int nume1, nume2, suma, resta, producto, division;
		
        nume1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        nume2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        operacion = JOptionPane.showInputDialog("Escriba que operacion quiere realizar").charAt(0);
        switch (operacion)
        {
        case 'S':
        case 's': suma= nume1+nume2; JOptionPane.showMessageDialog(null, "La suma es: " + suma); break;
        case 'R':
        case 'r': resta= nume1-nume2; JOptionPane.showMessageDialog(null, "La resta es: " + resta); break;
        case 'P':
        case 'p': producto= nume1*nume2; JOptionPane.showMessageDialog(null, "El producto es: " + producto); break;
        case 'D':
        case 'd': division= nume1/nume2; JOptionPane.showMessageDialog(null, "La division es: " + division); break;
        
        default:JOptionPane.showMessageDialog(null, "Error, no existe tal operacion");
        }
       
	}

}
