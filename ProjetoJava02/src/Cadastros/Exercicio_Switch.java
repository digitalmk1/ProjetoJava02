package Cadastros;

public class Exercicio_Switch {
	
	public static void main(String[] args) {
		

		 String frutas = "kiwis";
		
		switch (frutas){
		case "maçã":
			System.out.println("Estamos aguardo chegar");
			break;
		case "kiwis":
			System.out.println("Estamos com escassez de kiwis");
			break;
		case  "melancia":
			System.out.println("Aqui está, são 3 reais o quilo");
                break;
		default:
			System.out.println("Desculpa não temos essa fruta");
			break;
		}
	}

}
