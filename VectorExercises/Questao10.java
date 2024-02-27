package VectorExercises;

import java.util.Random;

public class Questao10 {
    public static void main (String[] args) {
        Random random = new Random();
        int m[][] = new int[5][5];
        int aux = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.printf("%d  ", m[i][j]);
            }
            System.out.println();
        }


        for (int j = 0; j < m.length; j++) {
            aux += m[3][j];
        }
        System.out.println("Soma da Linha 4: " + aux);
        aux = 0;

        for (int i = 0; i < m.length; i++) {
            aux += m[i][1];
        }
        System.out.println("Soma da Coluna 2: " + aux);
        aux = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (j == i) {
                    aux += m[i][j];
                }
            }
        }
        System.out.println("Soma da Diagonal Principal: " + aux);
        aux = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                aux += m[i][j];
            }
        }
        System.out.println("Soma de todos os elementos da matriz: " + aux);

    }
}
