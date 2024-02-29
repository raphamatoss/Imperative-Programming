package Useful;

import java.util.Scanner;

public class CalculadoraIncertezaC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira a incerteza tipo A: ");
        double a = sc.nextDouble();
        //System.out.printf("Insira a incerteza tipo B: ");
        //double b = sc.nextDouble();
        double b = 0.01;

        double aux = Math.pow(a, 2) + Math.pow(b, 2);
        double tipoC = Math.sqrt(aux);

        System.out.println(tipoC);
    }
}
