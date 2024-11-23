package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class DesafioNumeroPrimo {
	
	public static void main(String[] args) {
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		if (numero <= 1) {
			
			System.out.println(numero + " não é primo ");
			
		} else {
			
			boolean ehPrimo = true;
			
			for (int contador = 2; contador <=  Math.sqrt(numero); contador ++) {
				
				if (numero % contador ==0) {
					
					ehPrimo = false;
					
					break;
				}
			}
			
			if (ehPrimo) {
				
				JOptionPane.showMessageDialog(null, numero + " é primo.", "Resposta", JOptionPane.QUESTION_MESSAGE);
				
			} else {
				
				JOptionPane.showMessageDialog(null, numero + " não é primo.", "Resposta", JOptionPane.QUESTION_MESSAGE);
				
			}
		}
		
	}

}
