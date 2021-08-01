package Cadastros;

import java.util.Iterator;

public class Exercicio_03_For {

	public static void main(String[] args) {

		// String produto = "COCACOLA 3 LITROS ";
		/*
		 * for(int numero=0; numero <=10;numero++){ if(numero ==7) {
		 * 
		 * System.out.println( "Achei o numero  "+ numero);
		 * 
		 * break;
		 * 
		 * 
		 * 
		 * }
		 */
		String nome = "MARCIO";

		for (int numero = 0; numero <= 20; numero++) {
			if (numero == 7 || numero == 8 || numero == 10) {

				System.out.println(nome + " 1'1'qaxAchei o numero  " + numero);

				continue;

			}
		}
	}
}
