package Cadastros;

public class Exercicio_Switch {
	
	public static void main(String[] args) {
		

		 String frutas = "kiwis";
		
		switch (frutas){
		case "ma��":
			System.out.println("Estamos aguardo chegar");
			break;
		case "kiwis":
			System.out.println("Estamos com escassez de kiwis");
			break;
		case  "melancia":
			System.out.println("Aqui est�, s�o 3 reais o quilo");
                break;
		default:
			System.out.println("Desculpa n�o temos essa fruta");
			break;
		}
	}

}
