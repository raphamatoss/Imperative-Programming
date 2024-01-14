package TheHuxley;

import java.util.Scanner;

public class CalculeASerie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		double total = 0;
		
		System.out.println("Insira um valor N: ");
		n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				total = 0;
			} 
			else if (i == 1) {
				System.out.printf("%d/%d", i, i*3);
				total += 1/3;
			}
			else {
				System.out.printf(" + %d/%d", i, i*3);
				total += (1/3)*i;
			}
		}
		
		System.out.printf("\n%.2f", total);
		// total nao está recebendo o valor da soma, nao sei por quê.
		sc.close();
	}

}
