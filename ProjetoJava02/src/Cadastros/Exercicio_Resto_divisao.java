package Cadastros;

import javax.swing.JOptionPane;

public class Exercicio_Resto_divisao {
	
	/* jose tem 9 carros e quer difividir com 2 pessoas faça um programa mostre o resto da divisao
	 * e a quantidade de carros que cada pessoa recebeu. */
	
	public static void main(String[] args) {
		
	String nome =    JOptionPane.showInputDialog("INFORME SEU NOME:");	
	String carros =  JOptionPane.showInputDialog("INFORME O NUMERO DE CARROS:");	
	String pessoas = JOptionPane.showInputDialog("INFORME O NUMERO DE PESSOAS:");
	
	
	int CarrosNumeros = Integer.parseInt(carros);
	int PessoaNumero = Integer.parseInt(pessoas);
	
	int div = (CarrosNumeros / PessoaNumero);
	
	double RestoDiv = CarrosNumeros % PessoaNumero;
		
		JOptionPane.showMessageDialog(null,nome + " Cada pessoa recebeu "+ div + " Carros "+ "e sobrou " + RestoDiv + " carro isso lhe atende? ");
	}

}
