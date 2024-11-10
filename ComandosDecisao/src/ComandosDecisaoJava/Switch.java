package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Switch {
	
	public static void main (String [] args) {
		
		String fruta;
		
		
		fruta = JOptionPane.showInputDialog("Digite o nome de uma fruta: ");
		
		
		switch (fruta) {
		
		case "Banana": 
			
			System.out.println("Você digitou Banana!");	
			break;
			
		case "Laranja": 
			
			System.out.println("Você digitou Laranja!"); 
			break;
			
		case "Uva": 
			
			System.out.println("Você digitou Banana!");
			break;
			
			default:
				System.out.println("Você não digitou uma fruta válida.");
		}
		

		
	}	
		
	

}
