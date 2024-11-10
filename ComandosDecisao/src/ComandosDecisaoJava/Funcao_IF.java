package ComandosDecisaoJava;

import java.util.Scanner;

public class Funcao_IF {
	
	public static void main(String[] args) {
		
		java.util.Scanner ObjetoNome = new java.util.Scanner(System.in);
		System.out.println("Digite um nome:");
		String nome = ObjetoNome.nextLine();
		
		/*
		== - igual 
	 	!= - diferente
	 	> - maior que 
	 	< - menor que
	 	>= - maior ou igual 
	 	<= - menor ou igual 
		*/
		//Se
		if (nome.equals("ana")) {
			
			System.out.println("Você é a " + nome);
		
		} else {
		//Senao	
			System.out.println("Você não é a ana");
		}
	}
}

