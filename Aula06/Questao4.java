package Aula06;

import java.util.Scanner;

public class Questao4 {
/* 4. Escrever um programa que lê 5 valores para A, um de
   cada vez, e conta quantos destes valores são negativos, no
   final imprimir a quantidade e o menor valor.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, menor = Integer.MAX_VALUE, negativos = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite um valor para A: ");
			a = sc.nextInt();
			
			if (a < menor) {
				menor = a;
			}
			
			if (a < 0) {
				negativos += 1;
			}
		}
		
		System.out.println("Quantidade de negativos: " + negativos);
		System.out.println("Menor valor: " + menor);
	}

}
