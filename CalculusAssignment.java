import java.util.Scanner;
public class CalculusAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // recebe o valor de x para err(x)
        System.out.printf("Insira um valor de x: ");
        int x = sc.nextInt();
        // recebe a quantidade n de trapezios que serão utilizados para a aproximação
        System.out.printf("Insira o numero n de trapezios: ");
        int n = sc.nextInt();

        // printa o resultado da aproximação no console
        System.out.println("Resultado da aproximação: " + AproximacaoTrapezoidal(x, n));
    }

    static double AproximacaoTrapezoidal (int x, int n) {
        double somatorio = 0;         // inicia a variavel somatório com valor 0
        double deltaX = (double)x/n;  // inicia a variavel deltaX, como x-0 = x, então deltaX = x/n
        double xi = deltaX;           /* inicia a variavel xi, nesse caso ela será igual ao deltaX, a multiplicação
                                         pelo i irá surgir na estrutura de repetição abaixo */

        for (int i = 1; i <= n; i++) {
            somatorio += Math.exp(-Math.pow(xi*(i-1), 2)) + Math.exp(-Math.pow(xi*i, 2));
        }
        /*
        O laço roda de 1 até n, onde a cada iteração, o valor da  variável "somatorio" é acrescido.
        Math.exp é uma função da biblioteca Math que nos permite utilizar o exponencial(e), já o Math.pow
        é uma função que nos permite calcular a potência de um numero.
        */

        // multiplica o resultado do somatorio pelas constantes deltaX/2 e 2/sqrt(pi), o que fornece o resultado da função err(x)
        double resultado = (2.0/Math.sqrt(Math.PI))*deltaX*(0.5)*somatorio;

        return resultado;
    }
}
