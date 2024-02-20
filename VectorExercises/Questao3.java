package VectorExercises;
import java.util.Random;
public class Questao3 {

    public static void main(String[] args) {
        Random random = new Random();
        int vetor[] = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        for (int k : vetor) {
            System.out.println(k);
        }

        int auxIndex = vetor.length-1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor.length % 2 == 0) {
                if (i == vetor.length / 2) {
                    break;
                }
            }
            else{
                if (i == (int)(vetor.length/2)) {
                    break;
                }
            }

            int aux = vetor[i];
            vetor[i] = vetor[auxIndex];
            vetor[auxIndex] = aux;

            auxIndex--;
        }

        System.out.println("------------");

        for (int k : vetor) {
            System.out.println(k);
        }
    }

}
