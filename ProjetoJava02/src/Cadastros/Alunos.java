package Cadastros;

import com.sun.corba.se.spi.orbutil.fsm.State;

public class Alunos {

	static int mediaGeral = 10;

	public static void main(String[] args) {
// Para o aluno ser aprovado deve ter uma pontua��o maior que 60 
//para esta em recupera��o o aluno deve ter uma nota entre 50 a 59
// Caso seja menor quero que esse aluno serja reprovado.

		int nota1 = 50;
		int nota2 = 60;
		int nota3 = 40;
		int nota4 = 45;
		int media = 0;
		String aluno = "Marcio";

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media == 60) {

			System.out.println("Aluno " + aluno + " Aprovado com media " + media);

		} else if (media >= 40 && media <= 59) {

			System.out.println("Aluno " + aluno + " Em reucupera��o com media " + media);

		}else if(media >=61 && media<=62) {
			
			System.out.println("Aluno quase se ferra Aprovado no conselho de classe com media" + media);
		}else {
			
			System.out.println(" Aluno " + aluno + " Reprovado " + media);
		}

	}
}
