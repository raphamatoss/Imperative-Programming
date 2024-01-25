package Aula06;

import java.util.Scanner;

public class Questao1 {
/* 1. Uma loja oferece para os clientes um determinado
	desconto de acordo com o valor da compra efetuada.
	O desconto é de 20%, se o valor da compra for maior
	ou igual a R$250,00 e de 15%, se for menor. Construa
	um programa que, para um grupo de dez clientes,
	mostre nome, valor da compra, desconto e valor a
	pagar de cada cliente. Determine também o quanto
	a loja arrecadou com esses clientes. */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		Double desconto, valorDaCompra, valorAPagar; 
		Double valorTotal = 0.0;
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite o nome do cliente: ");
			nome = sc.nextLine();
			System.out.printf("Insira o valor da compra: ");
			valorDaCompra = sc.nextDouble();
			
			if (valorDaCompra >= 250) {
				desconto = 0.2;
				valorAPagar = valorDaCompra*(1-desconto);
			}
			else {
				desconto = 0.15;
				valorAPagar = valorDaCompra*(1-desconto);
			}
			
			System.out.printf("\nCliente: %s\n", nome);
			System.out.printf("Valor da Compra: %.2f\n", valorDaCompra);
			System.out.printf("Desconto: %.1f%%\n", desconto*100);
			System.out.printf("Valor a pagar: %.2f\n\n", valorAPagar);
			sc.nextLine();
			valorTotal += valorAPagar;
		}
		
		System.out.printf("Valor total arrecadado: %.2f", valorTotal);
	}
}
