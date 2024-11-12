package EstruturaDeRepeticao;

/*
 * Em um determinado quartel, o comandante determinou que, no primeiro dia
de treinamento da nova turma, os recrutas deveriam realizar 20 flexões de braço
e aumentar 5 flexões por dia ao longo do curso. Mantida essas condições, em 2
meses, quantas flexões cada recruta terá executado? (Considere o mês com 30
dias)
 */
public class DesafioQuestaoEsSa2024For {

    public static void main(String[] args) {

        int flexoesPorDia = 20; 
        int totalFlexoes = 0;

        for (int contador = 1; contador <= 60; contador++) {  
            totalFlexoes += flexoesPorDia;  
            flexoesPorDia += 5;  
        }

        System.out.println("Total de flexões realizadas em 2 meses: " + totalFlexoes);
    }
}

    

