package Cadastros;

import javax.swing.JOptionPane;

public class Exercicio_Resto_divisao {

	/*
	 * jose tem 9 carros e quer difividir com 2 pessoas fa�a um programa mostre o
	 * resto da divisao e a quantidade de carros que cada pessoa recebeu.
	 */

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("INFORME SEU NOME:");
		String carros = JOptionPane.showInputDialog("INFORME O NUMERO DE CARROS:");
		String pessoas = JOptionPane.showInputDialog("INFORME O NUMERO DE PESSOAS:");

		int CarrosNumeros = Integer.parseInt(carros);
		int PessoaNumero = Integer.parseInt(pessoas);

		int div = (CarrosNumeros / PessoaNumero);

		double RestoDiv = CarrosNumeros % PessoaNumero;

		int Resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");

		if (Resposta == 0) {

			JOptionPane.showMessageDialog(null, "O resultado da divis�o deu " + div);
		}

		Resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o Resto da divis�o? ");

		if (Resposta == 0) {

			JOptionPane.showMessageDialog(null, "O resultado da divis�o deu " + RestoDiv);
		}
		// JOptionPane.showMessageDialog(null,nome + " Cada pessoa recebeu "+ div + "
		// Carros "+ "e sobrou " + RestoDiv + " carro isso lhe atende? ");
	}

}
