package VectorExercises;

import java.util.Arrays;

public class Questao8 {
    public static void main(String[] args) {
        int a[] = new int[]{4, 2, -1, 3, -2, 6, 7, 3, 0, 9};
        int b[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                b[i] = Fatorial(a[i]);
            }
            else {
                b[i] = a[i];
            }
        }

        System.out.println(Arrays.toString(b));
    }

    static int Fatorial (int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * Fatorial(n -1);
        }
    }
}
