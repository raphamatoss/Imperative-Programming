package VectorExercises;
import java.util.Random;
public class Questao2 {
    public static void main(String[] args) {
        Random random = new Random();
        int vetor[] = new int[30];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        for (int k : vetor) {
            System.out.println(k);
        }

        for (int i = 0; i < vetor.length; i++) {
            int aux = vetor[i];
            if (vetor[i] % 2 != 0) {
                for (int j = i; j < vetor.length; j++) {
                   if (vetor[j] % 2 == 0) {
                       vetor[i] = vetor[j];
                       vetor[j] = aux;
                       break;
                   }
                }
            }
        }

        System.out.println("----------");

        for (int k : vetor) {
            System.out.println(k);
        }

    }


}
