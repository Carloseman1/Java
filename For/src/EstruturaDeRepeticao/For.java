package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class For {
	
	  public static void main(String[] args) {
		
		int  resultado, numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		for (int contador =1; contador <= 10; contador++){
			
			resultado = (contador * numero);
			
			System.out.println(numero + " x "+ contador + " = " + resultado);
		}
		
	
}

}
