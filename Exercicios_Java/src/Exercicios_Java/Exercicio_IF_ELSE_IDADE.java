package Exercicios_Java;

import javax.swing.JOptionPane;

public class Exercicio_IF_ELSE_IDADE {
	
	public static void main(String[] args) {
		
		int idade, anoidade;
		
		anoidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você nasceu: "));
		int idadeatual = 2024;
		idade = idadeatual - anoidade;
		
		if ( idade >= 18 ) {
			JOptionPane.showMessageDialog(null, "Você pode votar e tirar a habilitação!");	
			
		} else if (idade >=16) {
			
			JOptionPane.showMessageDialog(null, "Você só pode votar!");	
			
		} else {
			JOptionPane.showMessageDialog(null, "Você não pode votar e nem tirar a habilitação!");	
		}
		
	}

}
