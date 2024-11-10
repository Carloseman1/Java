package ComandosDecisaoJava;

import java.util.Scanner;

public class Funcao_IF_ELSEIF {
	
	public static void main (String[]args) {
		/*
		//Objeto da classe java.util
		Scanner ObjetoIdade = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		
		//next.Int - ler e retorna o número inteiro  
		idade = ObjetoIdade.nextInt();
		
		if (idade >= 18){
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		*/
		Scanner ObjetoNota = new Scanner(System.in);
		
		double nota1,nota2,nota3,nota4,media ;
		
		System.out.println("Digite a primeira nota: ");
		nota1 =ObjetoNota.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 =ObjetoNota.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 =ObjetoNota.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		nota4 =ObjetoNota.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4 ;
		
		
		if (media >= 7) {
			System.out.println("Média:" + media + " - Situação : Aprovado (a)");	
		} else if (media >= 2){
			System.out.println("Média:" + media + " - Situação : Recuperação");
		} else {
			System.out.println("Média: " + media + "- Situação: Reprovado (a)");
		}
		
	}

}
