package Cadastros;

public class Aula02_Switch {

	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 70;
		int nota4 = 10;
		int media = 0;
		String aluno = "Marcio";

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Switch case Server para  Operaçoes exatas */
		
		switch (media) {
		case 70:
			System.out.println("Aluno Aprovado " + media);
			
			break;
		case 60:
			System.out.println("Aluno Em recuperação " + media);
			break;
		case 50:
			System.out.println("Aluno reprovado " + media);
		default:
			System.out.println("Foi encontrado outro valor " + media);
			break;
		}
	}

}
