package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Exemplo_Funcao_IF_ELSE_JOptionPane {
	
	
		public static void main(String[] args) {
		
		int nota1, nota2 ,nota3, nota4, media, recuperacao, notarecuperacao;
		
		

		
		nota1 = Integer.parseInt (JOptionPane.showInputDialog("Digite o valor da primeira nota: "));
		nota2 = Integer.parseInt (JOptionPane.showInputDialog("Digite o valor da segunda nota: "));
		nota3 = Integer.parseInt (JOptionPane.showInputDialog("Digite o valor da terceira nota: "));
		nota4 = Integer.parseInt (JOptionPane.showInputDialog("Digite o valor da quarta nota: "));

		media = (nota1 + nota2 + nota3 + nota4) / 4 ;
		
		if (media >= 7) {
			
			JOptionPane.showMessageDialog(null, "Média: " + media + " - Situação: Aprovado(a) ");
			return;
		} else {
			JOptionPane.showMessageDialog(null, "Média: " + media + " - Situação: Recuperação. ");
		}
		
		notarecuperacao= Integer.parseInt (JOptionPane.showInputDialog("Digite a nota da recuperação: "));
		recuperacao = (media + notarecuperacao) /2;
		
		if (recuperacao >= 7) {
			
			JOptionPane.showMessageDialog(null, "Média: " + recuperacao + " - Situação: Aprovado(a) ");
			
		} else {
			JOptionPane.showMessageDialog(null, "Média: " + recuperacao + " - Situação: Reprovado  ");
		}
		
		
	}	

}
