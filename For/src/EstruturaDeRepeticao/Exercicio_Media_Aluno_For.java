package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_Media_Aluno_For {

	public static void main(String[] args) {
		
		String aluno;
		float nota1, nota2, media, somaMedias, mediaTurma;
		
		somaMedias = 0;
		
		for (int contador = 1; contador <= 3; contador ++) {
			
			aluno = JOptionPane.showInputDialog("Nome Aluno (a): ");
			nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira Nota: "));
			nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda Nota: "));
			
			media = (nota1+nota2)/2;
			somaMedias = somaMedias + media;	
			System.out.println("Aluno (a): " + aluno);
			System.out.println("Media: " + media);
			
			if (media >= 6 ) {
				
				System.out.println("Situação: Aprovado (a) ");
				
			} else {
				System.out.println("Situação: Reprovado");
			}
			
		}
		mediaTurma = somaMedias /3;
		System.out.println("\nMedia final da turma: " + mediaTurma);
	}
}
