package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Funcao_IF_ELSEIF_OU_E {

		public static void main (String []args) {
			// || - ou 
			/*String  fruta;
			
			fruta = JOptionPane.showInputDialog("Digite o nome de uma fruta: ");
			
			if (fruta.equals("Maça") || fruta.equals("Banana")) {
				
				JOptionPane.showMessageDialog(null, "A Fruta é "+ fruta );
				
			} else{
				JOptionPane.showMessageDialog(null, "Fruta inválida ");
				
			} */
			
			// && - e 
			
			String fruta1, fruta2;
			
			fruta1 = JOptionPane.showInputDialog("Digite o nome da primeira fruta: ");
			fruta2 = JOptionPane.showInputDialog("Digite o nome da segunda fruta: ");
			
			if (fruta1.equals("Maça") && fruta2.equals("Banana") ){
				
				JOptionPane.showMessageDialog(null, "Fruta 1: " + fruta1);
				JOptionPane.showMessageDialog(null, "Fruta 2: " + fruta2);
			} else {
				JOptionPane.showMessageDialog(null, "Não é maça ou banana");
			}
		}
		

}
