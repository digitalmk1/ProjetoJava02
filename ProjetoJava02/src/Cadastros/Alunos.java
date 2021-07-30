package Cadastros;

public class Alunos {

	public static void main(String[] args) {
		
		String nome = "MARCIO OLIVEIRA";
	int  nota1= 4;
    int nota2 =10;
	int nota3 = 5;
		
	int resultado = (nota1 + nota2 + nota3)/3;
	
	int total = nota1+ nota2 + nota3;
	
		
		if(total >=23) {
			System.out.println("Aluno " + nome + " Aprovado com media "+  resultado + " Total de pontos "+ total);
			  
			
			
		}else {
			
			System.out.println("Aluno " + nome +" Reprovado com media " + resultado + " Total de pontos "+ total);
		}
		
		
	}
}
