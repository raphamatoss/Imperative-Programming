package VectorExercises;

import java.util.Random;
public class Questao1 {
    public static void main(String[] args) {
        Random random = new Random();
        int vetor[] = new int[20];
        int menor = 0, index = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        for (int i = 0; i < vetor.length; i++) {
            if (i < vetor.length-1) {
                if (vetor[i] < vetor[i+1]) {
                    menor = vetor[i];
                    index = i;
                }
                else {
                    menor = vetor[i+1];
                    index = i+1;
                }
            }
            else {
                if (menor > vetor[i]) {
                    menor = vetor[i];
                    index = i;
                }
            }
        }

        /*
        for (int j : vetor) {
            System.out.println(j);
        }
        */

        System.out.printf("Menor valor: %d \n Index: %d", menor, index);
    }
}
