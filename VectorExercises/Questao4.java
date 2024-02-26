package VectorExercises;

import java.util.Random;

public class Questao4 {

    public static void main(String[] args) {
        Random random = new Random();
        String opcoes = "ABCDE";
        char gabarito[] = new char[20];
        char alunos[][] = new char[50][20];

        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = opcoes.charAt(random.nextInt(opcoes.length()));
        }

        for (int i = 0; i < alunos[i].length; i++) {
            for (int j = 0; j < alunos[j].length; j++) {
                alunos[i][j] = opcoes.charAt(random.nextInt(opcoes.length()));
            }
        }

        for (int i = 0; i < alunos[i].length; i++) {
            int acertos = 0;
            for (int j = 0; j < alunos[j].length; j++) {
                if (gabarito[j] == alunos[i][j]) {
                    acertos += 1;
                }
            }

            if (acertos >= 6) {
                System.out.printf("Aluno: %d \nAcertos: %d \nAprovado.\n\n", i+1, acertos);
            }
            else {
                System.out.printf("Aluno: %d \nAcertos: %d \nReprovado.\n\n", i+1, acertos);
            }
        }

    }
}
