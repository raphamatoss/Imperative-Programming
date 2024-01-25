package Aula06;

import java.util.Random;

public class Questao2 {
/* 2. Fazer um programa gere 50 valores e encontre o
   maior e o menor deles, imprimir no final o
   resultado. */
	
	public static void main(String[] args) {
		Random random = new Random();
		int valor, menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < 50; i++) {
			valor = random.nextInt();
			System.out.println(valor);
			
			if (menor > valor) {
				menor = valor;
			}
		}
		
		System.out.println("\nMenor valor = " + menor);
	}
}
