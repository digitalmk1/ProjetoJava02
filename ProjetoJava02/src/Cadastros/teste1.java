package Cadastros;

public class teste1 {
	
	public static void main(String[] args) {
		
	String nome = "Marcio silva de oliveira";
	int ano = 2002;
	int anoatual= 2021;
	
	int idade = (ano+anoatual);
	
	if(idade < 42) {
		
		System.out.println("Apto para ser vacinado"+nome + idade);
	} else {
		
		System.out.println("Aguarde a sua vez");
	}
	
	
	}

}
