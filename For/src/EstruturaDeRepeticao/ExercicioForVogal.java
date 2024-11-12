package EstruturaDeRepeticao;

import javax.swing.JOptionPane;

public class ExercicioForVogal {

    public static void main(String[] args) {
        
        String nome;
        int nomesComVogal = 0;
        int nomesComConsoante = 0;

            for(int i= 0; i <=3; i++){

                nome = JOptionPane.showInputDialog(null,"Digite o nome "+ " :", "Leia com atenção!", JOptionPane.QUESTION_MESSAGE);

                if(nome.trim().toLowerCase().charAt(0) == 'a' ||
                nome.trim().toLowerCase().charAt(0) == 'e' ||
                nome.trim().toLowerCase().charAt(0) == 'i' ||
                nome.trim().toLowerCase().charAt(0) == '0' ||
                nome.trim().toLowerCase().charAt(0) == 'u' ){

                nomesComVogal++ ;

                }

                nomesComConsoante = 3 - nomesComVogal;
                System.out.println("Total com vogal: "+ nomesComVogal);
                System.out.println("Total com consoante: "+ nomesComConsoante);
            }
    }
    
}
