package Aula06;

public class Questao5 {
/* 5. Construa um programa que imprima todos os
   números ímpares compreendidos entre 81 e 953. O
   algoritmo também deve mostrar a soma de todos os
   valores.*/
	
	public static void main(String[] args) {
		int contador = 81, soma = 0;
		
		while (contador <= 953) {
			if (contador % 2 != 0) {
				System.out.println(contador);
				soma += contador;
			}
			contador++;
		}
		
		System.out.printf("\nSoma: " + soma);
	}

}
