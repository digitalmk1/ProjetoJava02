package Cadastros;

import javax.swing.JOptionPane;

public class Exercicio_notaEscolar {

	public static void main(String[] args) {
		String aluno = JOptionPane.showInputDialog(" INFORME O NOME DO ALUNO ");
		String nota1 = JOptionPane.showInputDialog(" NOTA 1 UNIDADE ");
		String nota2 = JOptionPane.showInputDialog(" NOTA 2 UNIDADE ");
		String nota3 = JOptionPane.showInputDialog(" NOTA 3 UNIDADE ");
		String nota4 = JOptionPane.showInputDialog(" NOTA 4 UNIDADE ");

		double unidade1 = Double.parseDouble(nota1);
		double unidade2 = Double.parseDouble(nota2);
		double unidade3 = Double.parseDouble(nota3);
		double unidade4 = Double.parseDouble(nota4);

		double media = (unidade1 + unidade2 + unidade3 + unidade4) / 4;

		// JOptionPane.showMessageDialog(null, "A media das 4 unidades é: ");

		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "Aluno Aprovado! com media" + media);
			if (media >= 10) {
				JOptionPane.showMessageDialog(null, "Aluno Aprovado! com louvor parabens " + aluno);

			} else {

				JOptionPane.showMessageDialog(null, "Aluno Em Recuperação com media" + media);
			}

		} else {

			JOptionPane.showMessageDialog(null, "Aluno Reprovado! com media" + media);
		}
	}

}
