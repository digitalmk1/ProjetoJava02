package Cadastros;

import com.sun.corba.se.spi.orbutil.fsm.State;

public class Alunos {

	static int mediaGeral = 10;

	public static void main(String[] args) {
// Para o aluno ser aprovado deve ter uma pontuação maior que 60 
//para esta em recuperação o aluno deve ter uma nota entre 50 a 59
// Caso seja menor quero que esse aluno serja reprovado.

		int nota1 = 80;
		int nota2 = 80;
		int nota3 = 70;
		int nota4 = 10;
		int media = 0;
		String aluno = "Marcio";

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Operação aninhadas são operações dentro de operações */

		if (media >= 50) {
			if (media >= 70) {
				if(media >=80) {
					
					System.out.println("Aprovado com louvor");
				}

				System.out.println(aluno + " Aluno Aprovado direto " + media);
			} else {

				System.out.println("Aluno Em Recuperação!! " + media);
			}
		}else {
			
		System.out.println("Aluno Reprovado direto ");
		}

		// codição logica com IF E ELSE

		/*
		 * if (media == 60) {
		 * 
		 * System.out.println("Aluno " + aluno + " Aprovado com media " + media);
		 * 
		 * } else if (media >= 40 && media <= 59) {
		 * 
		 * System.out.println("Aluno " + aluno + " Em reucuperação com media " + media);
		 * 
		 * }else if(media >=61 && media<=62) {
		 * 
		 * System.out.
		 * println("Aluno quase se ferra Aprovado no conselho de classe com media" +
		 * media); }else {
		 * 
		 * System.out.println(" Aluno " + aluno + " Reprovado " + media); }
		 */

		/* Operadores ternarios para micro validações com */

		/*
		 * String saidaResultado;
		 * 
		 * saidaResultado = media >=60? "Aluno Aprovado":(media >= 40 && media <= 59) ?
		 * "Aluno em Recuperação": "Aluno reprovado";
		 * 
		 * // nesse exemplo o else é representado por : coloca todos os codigos em 1
		 * linha System.out.println(saidaResultado +" " + media );
		 */

	}
}
