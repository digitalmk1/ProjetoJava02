package Cadastros;

public class Alunos {

	public static void main(String[] args) {
		
   String nome = "MARCIO OLIVEIRA";
   String escola = "CLARICE FERREIRA";
	int  nota1= 4;
    int nota2 =10;
	int nota3 = 8;
		
	int resultado = (nota1 + nota2 + nota3)/3;
	
	int total = nota1+ nota2 + nota3;
	//Você pode esta usando double no lugar de um intereiro no campo resultado
		
		if(total >=20) {
			System.out.println("Aluno " + nome + "Escola:"+ escola  + " Aprovado com media "+  resultado + " Total de pontos "+ total);
			  
			
			
		}else {
			
			System.out.println("Aluno " + nome +" Reprovado com media " + resultado + " Total de pontos "+ total);
		}
		
		
	}
}
