package Exercicios_Java;

import javax.swing.JOptionPane;

public class IF_ELSE {
	
	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		if (numero % 2 == 1) {
			
			JOptionPane.showMessageDialog(null, numero + " Ímpar.");
			
		} else {
			JOptionPane.showMessageDialog(null, numero + " Par.");
		}
	}

}
