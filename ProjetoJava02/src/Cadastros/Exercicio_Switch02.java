package Cadastros;

public class Exercicio_Switch02 {

	public static void main(String[] args) {
		
		String dia = "7";
		
		
		switch (dia) {
		case "1":
			System.out.println("DOMINGO");
			break;
		case "2":
			System.out.println("SEGUNDA-FEIRA");
			break;
		case "3":
			System.out.println("TERÇA-FEIRA");
			break;
		case "4":
			System.out.println("QUARTA-FEIRA");
			break;
		case "5":
			System.out.println("QUINTA-FEIRA");
			break;
		case "6":
			System.out.println("SEXTA-FEIRA");
	          System.out.println("Dia de congregar com Rudnei");
	          break;
		
		case "7":
			System.out.println("SABADO");
			System.out.println("Dia de congregar com Daril");
			break;
		default:
			System.out.println("Esse dia não existe no calendario");
			break;
			
			
		}
		
		
	}   
		

		
		/*String carros = "parati";

		switch (carros) {
		case "hatch":
			System.out.println("Compra efetuada com sucesso");
			break;
		case "Motocicleta":
			System.out.println("Tem certeza que não prefere este modelo?");
			break;
		case "caminhonet":
			System.out.println("Tem certeza que não prefere este modelo?");
			break;
			
		case "sedan":
			System.out.println("Tem certeza que não prefere este modelo?");
			break;
			
		default:
			System.out.println("Não trabalhamos com este tipo de automóvel aqui");
			break;
		}
		*/
		

   
}
