package Exercicios_Java;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio_Imprimir_Numero_Ordem_Decrescente {

	public static void main(String[] args) {
		
		int numero1, numero2;
/*		
		Scanner ObjetoNumero = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		numero1 = ObjetoNumero.nextInt();
		System.out.println("Digite o valor número: ");
		numero2 = ObjetoNumero.nextInt();
		
		if (numero1 > numero2 ) {
			
			System.out.println("Resultado: " + numero2+ " -> " + numero1);
		} else {
			System.out.println("Resultado: " + numero1+ " -> " + numero2);
		}
*/
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		
		if (numero1 > numero2 ) {
			
			System.out.println("Resultado: " + numero1+ " -> " + numero2);
		} else {
			System.out.println("Resultado: " + numero2+ " -> " + numero1);
		}
		
	}
}
