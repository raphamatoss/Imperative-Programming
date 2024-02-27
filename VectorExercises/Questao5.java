package VectorExercises;

import java.util.Arrays;
import java.util.Random;

public class Questao5 {
    public static void main(String[] args) {
        Random random = new Random();
        int k[] = new int[15];
        int aux = 0;

        for (int i = 0; i < k.length; i++) {
            k[i] = random.nextInt(50);
        }

        for (int i = 0; i < k.length; i++) {
            if (primo(k[i])) {
                aux += 1;
            }
        }

        int p[] = new int[aux];

        for (int i = 0; i < k.length; i++) {
            if (primo(k[i])) {
                adicionaPrimo(k[i], p);
            }
        }

        System.out.println(Arrays.toString(p));
    }

    static boolean primo (int x) {
        boolean primes[] = new boolean[x + 1];

        for (int i = 2; i <= x; i++) {
            primes[i] = true;
        }

        // gets all the prime numbers till the number N using the Sieve of Eratosthenes
        for (int i = 2; i <= x; i++) {
            if (primes[i]) {
                for (int j = i+i; j <= x; j += i) {
                    primes[j] = false;
                }
            }
        }

        // it then analyze if the number N is true or not, if true, it's a prime! ;D
        if (primes[x]) {
            return true;
        }
        else {
            return false;
        }
    }


    static void adicionaPrimo (int x, int v[]) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 0) {
                v[i] = x;
                break;
            }
            else {
                continue;
            }
        }
    }
}
