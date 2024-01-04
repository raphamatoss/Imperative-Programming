import java.util.Locale;
import java.util.Scanner;

public class FirstAssigment {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int question = 0;

		do {
			System.out.println("Insert the number of the question(1-70), if you want to finish press 0:");
			question = sc.nextInt();

			switch (question) {
			case (1):
				First();
				break;
			case (2):
				Second();
				break;
			case (3):
				Third();
				break;
			case (4):
				Fourth();
				break;
			case (5):
				Fifth();
				break;
			case (6):
				Sixth();
				break;
			case (7):
				Seventh();
				break;
			case (8):
				Eighth();
				break;
			case (9):
				Nineth();
				break;
			case (10):
				Tenth();
				break;
			case (11):
				Eleventh();
				break;
			case (48):
				FourtyEighth();
				break;
			case (49):
				FourtyNineth();
				break;
			default:
				if (question == 0) {
					System.out.println("Finishing process...");
				} else {
					System.out.println("Invalid number.");
				}
			}
		} while (question != 0);

	}

	public static void First() {
		/* 
		Description:
		- Escrever um algoritmo para ler dois valores numéricos e apresentar a diferença do maior pelo menor.
		- Write an algorithm to read two numeric values and show the difference of the largest one by the smallest. 
		*/
		System.out.println("Insert two numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		if (number1 > number2) { 
			System.out.printf("%d\n\n", number1-number2);
		}
		else {
			System.out.printf("%d\n\n", number2-number1);
		}
	}
	
	public static void Second() {
		/*
		Description: 
		- Faça um algoritmo que leia um número e mostre uma mensagem indicando se este número é 
		  par ou ímpar e se é positivo ou negativo.
		- Build an algorithm which reads a number and shows if it is an even or an odd number and if
		  it is positive or negative. 
		*/	
		System.out.println("Insert a number: ");
		int number = sc.nextInt();
		
		if (number % 2 == 0) {
			System.out.print("It's an even number ");
			if (number > 0) {
				System.out.println("and positive number.\n");
			}
			else {
				System.out.println("and negative number.\n");
			}
		} else {
			System.out.print("It's an odd ");
			if (number > 0) {
				System.out.println("and positive number.\n");
			}
			else {
				System.out.println("and negative number.\n");
			}
		}
	}
	
	public static void Third() {
		/*
		 Description: 
		 - Escrever um algoritmo para ler dois números. Se os números forem iguais imprimir a
		   mensagem: “Números iguais” e encerrar a execução; caso contrário, imprimir o de
		   maior valor, acompanhando pela mensagem “é maior número”.
		 - Write an algorithm to read two numbers. If they are equal then print the message: "Equal numbers"
		   and finish the process; if not, print the largest value with the message "is the largest number".
		 */
		System.out.println("Insert two numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		int largest = (number1 > number2) ? number1 : number2;
		
		if (number1 == number2) {
			System.out.println("Equal numbers.\n");
		} else {
			System.out.println(largest + " is the largest number.\n");
		}
	}
	
	public static void Fourth() {
		/*
		Description:
		- Escrever um algoritmo para ler e imprimir três números. Se o primeiro for positivo,
		  imprimir sua raiz quadrada, caso contrário, imprimir o seu quadrado; se o segundo
		  número for maior que 10 e menor que 100, imprimir a mensagem: “Número está entre
		  10 e 100 – intervalo permitido”; se o terceiro número for menor que o segundo,
		  calcular e imprimir a diferença entre eles, caso contrário, imprimir o terceiro número
		  adicionado de 1.
		- Write an algorithm to read and print three numbers. If the first is greater than zero,
		  print its square root, otherwise print its square; if the second is greater than 10 and
		  less than 100, print the message: "This number is between 10 and 100 - allowed gap"; if 
		  the third is less than the second, compute and print the difference between them, if not
		  print the third number added 1;
		*/
		System.out.println("Insert three numbers: ");
		float number1 = sc.nextFloat();
		float number2 = sc.nextFloat();
		float number3 = sc.nextFloat();
		
		// first number cases
		if (number1>0) {
			System.out.printf("The square root of the first number is: %.2f\n", Math.pow(number1, 0.5));
		}
		else {
			System.out.printf("The square of the first number is: %f\n", Math.pow(number1, 2));
		}
		
		// second number case
		if (number2 > 10 && number2 < 100) {
			System.out.println("The second number is between 10 and 100 - allowed gap.");
		}
		
		// third number cases
		if (number3<number2) {
			System.out.printf("The difference between the second and the third number is: %.2f\n\n", number2-number3);
		}
		else {
			System.out.printf("The third number added 1 equals to: %.2f\n\n", number3+1);
		}
		
	}
	
	public static void Fifth() {
		/*
		 Description: 
		 - Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo
   		   para calcular seu peso ideal, utilizando as seguintes fórmulas:
		      - para homens:72,7 * altura – 58
			  - para mulheres:62,1 * altura – 44,7
		 - Having height and gender of a person as input data, built an algorithm to compute its
		   ideal weight, using the following formulas:
		      - for men: 72,7 * height - 58
		      - for women: 62,1 * height - 44,7
		 */
		System.out.println("Insert your height and biological gender(male, female), respectively: ");
		double height = sc.nextDouble();
		//sc.nextLine();
		String gender = sc.next().toLowerCase();
	
		double weight;
		
		if (gender.equals("male")) {
			weight = 72.7 * height - 58;
			System.out.printf("Your ideal weight is: %.2f\n\n", weight);
		}
		else {
			weight = 62.1 * height - 44.7;
			System.out.printf("Your ideal weight is: %.2f\n\n", weight);
		}
		
	}
	
	public static void Sixth() {
		/*
		Description: 
		- Elabore um algoritmo que, dada a idade de um nadador, classifique-o em uma das
		  seguintes categorias:
          	Infantil A: 5 a 7 anos;
			Infantil B: 8 a 10 anos;
			Juvenil A: 11 a 13 anos;
			Juvenil B: 14 a 17 anos;
			Sênior: maiores de 18 anos.
		- Elaborate an algorithm which informed the age of a swimmer, classifies it in one 
		  of the categories bellow:
		  	Shrimp A: 5 to 7 years;
		  	Shrimp B: 8 to 10 years;
		  	Fish A: 11 to 13 years;
		  	Fish B: 14 to 17 years;
		  	Dolphin: older than 18 years.
		  	
		  	----- i've used some creativity when translating the categories to english, they do not translate to the same in portuguese! --------
		*/
		System.out.println("Insert the age of the swimmer: ");
		int age = sc.nextInt();
			
		if (age >= 5 && age <= 7) {
			System.out.println("Congratulations! You're a Shrimp A!\n");
		}
		else if (age >= 18) {
			System.out.println("Congratulations! You're a Dolphin!\n");
		}
		else if (age >= 14) {
			System.out.println("Congratulations! You're a Fish B!\n");
		}
		else if (age >= 11) {
			System.out.println("Congratulations! You're a Fish A!\n");
		}
		else if (age >= 8) {
			System.out.println("Congratulations! You're a Shrimp B!\n");
		}
		else if (age < 0) { // if the age is less than 0, the method gets recalled
			System.out.println("Invalid Option.\n");
			Sixth();
		}
		else { // if the age is between 0 and 5, it gets here
			System.out.println("What a hurry! Soon you get classified!\n");
		}
		
	}
	
	public static void Seventh() {
		/*
		Description: 
		- Faça um algoritmo que leia duas notas obtidas por um aluno na disciplina de Cálculo,
		  o número de aulas ministradas e o número de aulas assistidas por este aluno nesta
		  disciplina. Calcule e mostre a média final deste aluno e diga se ele foi aprovado ou
		  reprovado. Considere que para um aluno ser aprovado ele deve obter média final igual
		  ou maior a 6 e ter no mínimo 75% de frequência.
		- Write an algorithm which reads two grades of a Calculus student, the total number of
		  Calculus classes and the total number of watched classes by the student. Compute and
		  display the final grade of this student and if he has been approved or not. Consider
		  that he must have a final grade greater or equal to 6 and a minimum class frequency of 75%. 
		*/
		System.out.println("Insert the two grades of the student: ");
		double firstGrade = sc.nextDouble();
		double secondGrade = sc.nextDouble();
		System.out.println("Insert the total number of classes: ");
		int totalClasses = sc.nextInt();
		System.out.println("Insert the total number of watched classes by the student: ");
		int watchedClasses = sc.nextInt();
		
		double finalGrade = (firstGrade+secondGrade)/2;
		double frequency = (double) (watchedClasses*100)/totalClasses;
		
		if (finalGrade >= 6.0 &&  frequency >= 75.0) {
			System.out.println("Approved.\n");
		}
		else {
			System.out.println("Reproved.\n");
		}
		
	}
		
	public static void Eighth() {
		/*
		Description: 
		- Leia 3 valores inteiros (X, Y, Z), determina e escreve o menor deles.
		- Read two integer valuers (x, y, z) and determine the smallest among them.
		*/
		System.out.println("Insert three numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z= sc.nextInt();
		
		if (x < y && x < z) {
			System.out.println(x + " is the smallest.\n");
		}
		else if (y < z) {
			System.out.println(y + " is the smallest.\n");
		}
		else {
			System.out.println(z + " is the smallest.\n");
		}
		
	}
	
	public static void Nineth() {
		/*
		Description: 
		- Desenvolva um algoritmo que efetue a leitura de três valores para os lados de um
		  triângulo, considerando lados como: A, B e C. O algoritmo deverá verificar se os
		  lados fornecidos forma realmente um triângulo (cada lado é menor que a soma dos
		  outros dois lados). Se for esta condição verdadeira, deverá ser indicado qual tipo de
          triângulo foi formado: isósceles (dois lados iguais e um diferente), escaleno (todos os
          lados diferentes) ou equilátero (todos os lados são iguais).
		- Develop an algorithm that reads three values to each side of a triangle, considering 
		  the sides as: A, B and C. The algorithm must verify if the given sides can really form
		  a triangle(each side is less than the sum of the other two sides). If this condition is 
		  true, then it must inform what type of triangle was formed: isoceles(two equal sides and
		  one diferent), scalene(all sides are different) or equilateral(all sides are the same). 
		*/
		System.out.println("Insert three values, one for each side of the triangle: ");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		if (A < B+C && B < A+C && C < B+A) {
			if (A == B && A == C) {
				System.out.println("It's an equilateral triangle.\n");
			}
			else if (A != B && A != C) {
				System.out.println("It's a scalene triangle.\n");
			}
			else {
				System.out.println("It's an isoceles triangle.\n");
			}
		}
		else {
			System.out.println("It's not a triangle.\n");
		}
		
	}
	
	public static void Tenth() {
		/*
		Description: 
		- A Secretaria de Meio Ambiente, que controla o índice de poluição, mantém 3 grupos
		  de indústrias que são altamente poluentes do meio ambiente. O índice de poluição
		  aceitável varia de 0,05 até 0,29. Se o índice sobe para 0,3 as indústrias do 1o grupo
		  são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as indústrias
		  do 1o e 2o grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5
		  todos os grupos devem ser notificados a paralisarem suas atividades. Faça um
		  programa que leia o índice de poluição e escreva quais serão os grupos intimados.
		- The Environment Secretariat, which controls the polution levels, keeps three groups
		  of industries that are highly environmental pollutants. The acceptable levels are between
		  0.05 to 0.29. If the level rises to 0.3 the first group industries are required to 
		  suspend its activities, if the levels rises to 0.4 the first and the second groupm are
		  required to suspend its activities, if the level reaches 0.5 all groups must be notified 
		  and required to suspend their activities. Build a program that reads the pollution level 
		  and writes which groups are getting notified.
		*/
		System.out.println("Insert the pollution level: ");
		double pollutionLevel = sc.nextDouble();
		
		if (pollutionLevel >= 0.5) {
			System.out.println("All groups are getting notified.\n");
		}
		else if (pollutionLevel >= 0.4) {
			System.out.println("The first and the second group are getting notified.\n");
		}
		else if (pollutionLevel >= 0.3) {
			System.out.println("The first group is getting notified.\n");
		}
		else {
			System.out.println("Safe levels. None of the groups are getting notified.\n");
		}
		
	}
	
	public static void Eleventh() {
		/*
		Description: 
		- Faça um algoritmo que receba um valor que foi depositado, a taxa de juros anual e o
		  tempo em anos que se espera fazer o investimento. Ao final exiba o valor do montante
	 	  acumulado.
		-  Write an algorithm that receives a deposited value, the annual interest rate and the
		   the time(in years) which the investment is expected to be done. At the end display the
		   the final value.
		*/
		System.out.println("Insert the initial deposit: ");
		double initialDeposit = sc.nextDouble();
		System.out.println("Insert the annual interest rate: ");
		double interestRate = sc.nextDouble();
		System.out.println("Insert the expected time, in years: ");
		int years = sc.nextInt();
		
		double finalValue = initialDeposit*Math.pow(1+interestRate, years);
		
		System.out.printf("The final value is: %.2f\n\n", finalValue);
	}
	
	public static void FourtyEighth() {
		/*
		Description: 
		- A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas
		  fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada
          fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100
          gramas, faça um algo ritmo em que o dono forneça a quantidade de sanduíches a fazer,
          e a máquina informe as quantidades (em quilos) de queijo, presunto e carne
          necessários para compra.
		- The snack bar Gostosura sells only one type of sandwich, which dressing includes two
		  cheese slices, one ham slice and one burger meat. Knowing that any cheese or ham slice
		  weights 50 grams and that the burger meat weights 100 grams, write an algorithm to receive
		  the amount of sandwiches to make as input and outputs the amount(in kilograms) of cheese,
		  ham and meat needed to get bought. 
		*/
		System.out.println("Insert the amount of sandwiches you desire to make: ");
		int amount = sc.nextInt();
		
		int cheese = 2*50 * amount;
		int ham = 50 * amount;
		int meat = 100 * amount;
		
		System.out.printf("The amount of cheese needed is: %.2fKg\n", (double)cheese/1000);
		System.out.printf("The amount of ham needed is: %.2fKg\n", (double)ham/1000);
		System.out.printf("The amount of meat needed is: %.2fKg\n\n", (double)meat/1000);
		
	}

	public static void FourtyNineth() {
		/*
		Description: 
		- Alguns países medem temperaturas em graus Celsius, e outros em graus Fahrenheit.
		  Faça um algoritmo para ler uma temperatura Celsius e imprimi-la em Fahrenheit
		  (pesquise como fazer este tipo de conversão).
		- Some countries measure temperatures in Celcius and some in Fahrenheit. Write an
		  algorithm to read the temperature in Celcius and print it in Fahrenheit.
		*/
		System.out.println("Insert the temperature in Celcius: ");
		double celcius = sc.nextDouble();
				
		double fahrenheit = 1.8*celcius + 32;
		
		System.out.printf("The temperature in Fahrenheit is: %.1f\n\n", fahrenheit);
	}
	
}
