package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class ExercicioImparOuParFor {

    public static void main(String[] args) {
        
        int numero;
        int soma = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número inteiro positivo maior que 1","Leia com atenção.", JOptionPane.QUESTION_MESSAGE));

        for (int contador = 1; contador <= numero; contador ++){

           if (contador %2 == 1){

            soma += contador;
           }
           System.out.println(soma);
            

        }

    }
    
}
