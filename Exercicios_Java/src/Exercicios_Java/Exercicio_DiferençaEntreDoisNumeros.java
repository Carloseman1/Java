package Exercicios_Java;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_DiferençaEntreDoisNumeros {
	
	public static void main(String[] args) {
		
/*		int numero1, numero2, diferenca;
		
		Scanner ObjetoNumero = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro número: ");	
		numero1 = ObjetoNumero.nextInt();
		
		System.out.println("Digite o valor do Segundo número: ");	
		numero2 = ObjetoNumero.nextInt();
		
		diferenca = numero1 - numero2;
		
			System.out.println("-------Resposta do Exercicio-------");
			System.out.println("Primeiro número: " + numero1);
			System.out.println("Segundo número: "+ numero2);
			System.out.println("Diferença= " + numero1 + " - " + numero2 + " = " + diferenca);
*/
		int numero1, numero2, diferenca;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
		
		if (numero1 >= numero2) {
			
			diferenca = numero1 - numero2;
					
			System.out.println("-------Resposta do Exercicio-------");
			System.out.println("Primeiro número: " + numero1);
			System.out.println("Segundo número: "+ numero2);
			System.out.println("Diferença= " + numero1 + " - " + numero2 + " = " + diferenca);
			
		} else {
			
			diferenca = numero2 - numero1;
					
			System.out.println("-------Resposta do Exercicio-------");
			System.out.println("Primeiro número: " + numero1);
			System.out.println("Segundo número: "+ numero2);
			System.out.println("Diferença= " + numero2 + " - " + numero1 + " = " + diferenca);
		}
		
		
	}

}
