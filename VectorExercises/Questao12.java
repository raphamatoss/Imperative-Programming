package VectorExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Questao12 {
    static int pontosJogador1 = 700;
    static int pontosJogador2 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] navios = new int[10][5];
        String[][] mapa = new String[11][6];
        int x; int y;

        desenhaMapaEscondido(mapa);

        System.out.println("\nJogador 1: Posicionamento dos navios!");
        for (int i = 1; i < mapa.length; i ++) {
            System.out.printf("Digite as coordenadas(x, y) de onde deseja posicionar seu navio %d: ", i);
            x = sc.nextInt();
            y = sc.nextInt();
            while (x > 10 || y > 5) {
                System.out.printf("Coordenadas inválidas, insira novamente as cooordenadas(x, y) do navio %d: ", i);
                x = sc.nextInt();
                y = sc.nextInt();
            }
            adicionaNavio(mapa, navios, x, y);
        }

        System.out.println("\n\n");
        desenhaMapaEscondido(mapa);
        System.out.println("\nJogador 2: Jogue as bombas!");
        for (int i = 1; i < mapa.length; i++) {
            System.out.printf("Digite as coordenadas(x,y) de onde deseja soltar a sua bomba %d: ", i);
            x = sc.nextInt();
            y = sc.nextInt();
            while (x > 10 || y > 5) {
                System.out.printf("Coordenadas inválidas, insira novamente as cooordenadas(x, y) da bomba %d: ", i);
                x = sc.nextInt();
                y = sc.nextInt();
            }
            soltaBomba(mapa, navios, x, y);
        }

        System.out.println("\nPontos Jogador 1: " + pontosJogador1);
        System.out.println("Pontos Jogador 2: " + pontosJogador2);

    }

    static void desenhaMapaEscondido(String[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                // layout horizontal numbers bar
                if (i == 0) {
                    if (i == j) {
                        m[i][j] = " -";
                    }
                    else {
                        m[i][j] = Integer.toString(j);
                    }
                }
                else {
                    m[i][j] = "~";
                }
            }

            // layout vertical numbers bar
            if (i > 0 && i < 10) {
                m[i][0] = " " + Integer.toString(i);
            }
            else if (i == 10) {
                m[i][0] = Integer.toString(i);
            }
        }

        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }

    static void adicionaNavio(String[][] mapa, int[][] navio, int x, int y) {
        navio[x-1][y-1] = 1;
        mapa[x][y] = "N";

        for (int i = 0; i < mapa.length; i++) {
            System.out.println(Arrays.toString(mapa[i]));
        }
    }

    static void soltaBomba(String[][] mapa, int[][] navio, int x, int y) {
        if (navio[x-1][y-1] == 1) {
            mapa[x][y] = "X";
            System.out.println("Acertou! 100 Pontos!\n");

            pontosJogador2 += 100;
            pontosJogador1 -= 70;
            // há alguma maneira de eu alterar as variaveis as declarando dentro do main? em vez de torna-las globais
        }
        else {
            mapa[x][y] = "O";
            System.out.println("Errou!\n");
        }

        for (int i = 0; i < mapa.length; i++) {
            System.out.println(Arrays.toString(mapa[i]));
        }
    }

}
