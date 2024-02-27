package VectorExercises;

import java.util.Arrays;
import java.util.Random;

public class Questao7 {
    public static void main (String[] args) {
        Random random = new Random();
        int filmesPorCliente[] = new int[500];
        int locacoesGratis[] = new int[500];

        for (int i = 0; i < filmesPorCliente.length; i++) {
            filmesPorCliente[i] = random.nextInt(25);
        }

        // filmesPorCliente[i]/10 irá resultar em um numero inteiro, se filmesPorCliente[i] > 10, o cliente tem direito a uma locação gratis, se > 20, 2 e assim por diante...
        for (int i = 0; i < filmesPorCliente.length; i++) {
            if (filmesPorCliente[i]/10 >= 1) {
                locacoesGratis[i] = (filmesPorCliente[i]/10);
            }
        }

        System.out.println(Arrays.toString(locacoesGratis));
    }
}
