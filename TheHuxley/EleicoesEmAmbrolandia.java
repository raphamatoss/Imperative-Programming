// por algum motivo o theHuxley n aceita, por mais q o output seja o mesmo

package TheHuxley;

import java.util.Scanner;

public class EleicoesEmAmbrolandia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alibaba = 0;
		int alcapone = 0;
		int branco = 0;
		int nulo = 0;
		int voto, vencedor;
		
		do {
			System.out.println("Digite o numero do candidato que deseja votar: ");
			System.out.println("83...................Alibaba");
			System.out.println("93..................Alcapone");
			System.out.println("0.....................Branco");
			System.out.println("Digite qualquer outro numero diferente de -1, 0, 83 e 93 para votar nulo.");
			voto = sc.nextInt();
			System.out.println();
			
			switch(voto) {
			case(83):
				alibaba += 1;
				break;
			case(93):
				alcapone += 1;
				break;
			case(0):
				branco += 1;
				break;
			default:
				nulo += 1;
				break;
			}
			
		} while (voto != -1);
		nulo -= 1;
		
		if (alcapone == 0) {
			alcapone = 1;
		}
		
		if (alibaba == 0) {
			alibaba = 1;
		}
		
		int votosTotais = branco+alcapone+alibaba;
		double percentualAlibaba = alibaba*100/votosTotais;
		double percentualAlcapone = alcapone*100/votosTotais;
		
		if (alcapone>alibaba) {
			vencedor = 93;
		}
		else {
			vencedor = 83;
		}
		
		System.out.println(alibaba);
		System.out.println(alcapone);
		System.out.println(branco);
		System.out.println(nulo);
		System.out.println(vencedor);
		System.out.printf("%.2f\n", percentualAlibaba);
		System.out.printf("%.2f", percentualAlcapone);
		
		sc.close();
	}

}
