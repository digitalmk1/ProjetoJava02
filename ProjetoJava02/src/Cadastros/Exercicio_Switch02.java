package Cadastros;

public class Exercicio_Switch02 {

	public static void main(String[] args) {

		String carros = "parati";

		switch (carros) {
		case "hatch":
			System.out.println("Compra efetuada com sucesso");
			break;
		case "Motocicleta":
			System.out.println("Tem certeza que n�o prefere este modelo?");
			break;
		case "caminhonet":
			System.out.println("Tem certeza que n�o prefere este modelo?");
			break;
			
		case "sedan":
			System.out.println("Tem certeza que n�o prefere este modelo?");
			break;
			
		default:
			System.out.println("N�o trabalhamos com este tipo de autom�vel aqui");
			break;
		}
	}

}
