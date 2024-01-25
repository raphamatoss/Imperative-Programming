package Aula06;

import java.util.Scanner;

public class Questao3 {
/* 3. Faça um programa que leia uma quantidade não
   determinada de números positivos. Calcule a quantidade
   de números pares e ímpares, a média de valores pares e a
   média geral dos números lidos. O número que encerrará a
   leitura será zero; */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor, contador1 = 0, contador2 = 0;
		double mediaPares = 0, mediaTotal = 0;
		
		do {
			System.out.printf("Digite um valor: ");
			valor = sc.nextInt();
			
			if (valor % 2 == 0) {
				mediaPares += valor;
				contador1 += 1;
			}
			
			mediaTotal += valor;
			contador2 += 1;
		} while(valor != 0);
		
		mediaPares = (double)mediaPares/(contador1-1);
		mediaTotal = (double)mediaTotal/(contador2-1);
		
		System.out.println("Media dos valores pares: " + mediaPares);
		System.out.println("Media total: " + mediaTotal);
	}
}
