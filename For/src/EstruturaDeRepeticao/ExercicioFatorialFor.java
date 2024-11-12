package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class ExercicioFatorialFor {
    
    public static void main(String[] args) {
        
        int numero;
        int fatorial = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: ", "Pergunta: ", JOptionPane.QUESTION_MESSAGE));

        for(int contador = 1; contador <= numero; contador ++ ){

            fatorial = fatorial * contador;

        }

        System.out.println(fatorial);
        
    
    }
    
}
