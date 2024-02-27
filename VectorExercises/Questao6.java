package VectorExercises;

import java.util.Random;

public class Questao6 {
    public static void main(String[] args) {
        Random random = new Random();
        int x[] = new int[20];

        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(20);
        }

        for (int i = 0; i < x.length; i++) {
            int aux = 1;
            for (int j = i+1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    aux += 1;
                    x[j] = -1;
                }
            }

            if (x[i] > 0) {
                System.out.println("Valor: " + x[i] + "\nNumero de ocorrencias: " + aux + "\n");
            }
        }
     }
}
