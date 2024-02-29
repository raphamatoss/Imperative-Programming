package Useful;

import java.util.Scanner;

public class CalculadoraDesvioPadrao {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double x;

        System.out.print("Insira o valor médio de x: ");
        double xBarra = sc.nextDouble();
        System.out.printf("Insira a quantidade de valores de x: ");
        x = sc.nextDouble();

        System.out.println(desvioPadrao(xBarra, x));
    }

    static double desvioPadrao(double xbarra, double x) {
        double somatorio = 0;
        double aux;
        for (int i = 0; i < x; i++) {
            System.out.printf("Insira um valor de x: ");
            aux = sc.nextDouble();
            somatorio += Math.pow((aux - xbarra),2);
        }

        return Math.sqrt(somatorio/(x-1));
    }

}
