package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Exemplo_Switch {

	public static void main(String[] args) {
		
		int mes = 5;
		
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mês entre 1 e 12: "));
		
		switch (mes) {
		
		case 1: case 2: case 3: case 4: case 5:
			
			System.out.println("O mes esta entre 1 e 5.");
			
			break;
			
		case 6:
		case 7:
		case 8:
		case 9: 
		case 10:
			
			System.out.println("O mês esta entre 6 e 10");
			
			break;
			
		case 11: case 12:
			System.out.println("O mês esta entre 11 e 12");
			
			break;
			
		default: 
			
			System.out.println("Mês inválido.");
			
		}
		
	}
}
