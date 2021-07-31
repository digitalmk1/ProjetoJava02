package Cadastros;

import com.sun.corba.se.spi.orbutil.fsm.State;

public class Alunos {

	static int mediaGeral = 10;

	public static void main(String[] args) {
// Para o aluno ser aprovado deve ter uma pontuação maior que 60 
//para esta em recuperação o aluno deve ter uma nota entre 50 a 59
// Caso seja menor quero que esse aluno serja reprovado.

		int nota1 = 80;
		int nota2 = 60;
		int nota3 = 40;
		int nota4 = 75;
		int media = 0;
		String aluno = "Marcio";

		// codição logica com IF E ELSE
		media = (nota1 + nota2 + nota3 + nota4) / 4;
            /*
		if (media == 60) {

			System.out.println("Aluno " + aluno + " Aprovado com media " + media);

		} else if (media >= 40 && media <= 59) {

			System.out.println("Aluno " + aluno + " Em reucuperação com media " + media);

		}else if(media >=61 && media<=62) {
			
			System.out.println("Aluno quase se ferra Aprovado no conselho de classe com media" + media);
		}else {
			
			System.out.println(" Aluno " + aluno + " Reprovado " + media);
		} */
              
		
		
		         /*Operadores ternarios para micro validações com */
		
		String saidaResultado;
		
		saidaResultado = media >=60? "Aluno Aprovado":(media >= 40 && media <= 59) ? "Aluno em Recuperação": "Aluno reprovado";
		
		// nesse exemplo o else é representado por : coloca todos os codigos em 1 linha
		System.out.println(saidaResultado +" " + media );
	}
}
