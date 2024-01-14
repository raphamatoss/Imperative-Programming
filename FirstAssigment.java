import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

import UsedClasses.*;

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
			case (12):
				Twelveth();
				break;
			case (13):
				Thirteenth();
				break;
			case (14):
				Fourteenth();
				break;
			case (15):
				Fifteenth();
				break;
			case (16):
				Sixteenth();
				break;
			case (17):
				Seventeenth();
				break;
			case (18):
				Eighteenth();
				break;
			case (19):
				Nineteenth();
				break;
			case (20):
				Twentieth();
				break;
			case (21):
				TwentyFirst();
				break;
			case (22):
				TwentySecond();
				break;
			case (23):
				TwentyThird();
				break;
			case (24):
				TwentyFourth();
				break;
			case (25):
				TwentyFifth();
				break;
			case (26):
				TwentySixth();
				break;
			case (27):
				TwentySeventh();
				break;
			case (30):
				Thirty();
				break;
			case (48):
				FourtyEighth();
				break;
			case (49):
				FourtyNineth();
				break;
			case(58):
				FiftyEighth();
				break;
			case(59):
				FiftyNineth();
				break;
			case(60):
				Sixtieth();
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
	
	public static void Twelveth() {
		/*
		Description: 
		- No description due to a table required, the original question can be visualized on its pdf. 
		*/
		System.out.println("Insert the balance: ");
		double balance = sc.nextDouble();
		
		double credit;
		
		if (balance > 2000) {
			credit = balance*0.2;
		}
		else if (balance > 4000) {
			credit = balance*0.3;
		}
		else if (balance > 6000) {
			credit = balance*0.4;
		}
		else {
			credit = 0;
		}
		
		System.out.printf("The balance is: %.2f\n", balance);
		System.out.printf("The credit is: %.2f\n\n", credit);
		
	}

	public static void Thirteenth() {   // return and redo this question later when i adquire OOP knowledges, it seems a good one to practice.
		/* 
		Description: 
		- No description due to a table required, the original question can be visualized on its pdf. 
		*/
		System.out.println("Insert the product's code: ");
		int code = sc.nextInt();
		System.out.println("How many? ");
		int amount = sc.nextInt();
		
		double finalPrice = 0;
		
		int product1 = 1001; // R$ 5,32
		int product2 = 1324; // R$ 6,45
		int product3 = 6548; // R$ 2,37
		int product4 = 987;  // R$ 5,32
		int product5 = 7623; // R$ 6,45
		
		switch(code) {
		case(1001):
			finalPrice = 5.32 * amount;
			break;
		case(1324):
			finalPrice = 6.45 * amount;
			break;
		case(6548):
			finalPrice = 2.37 * amount;
			break;
		case(987):
			finalPrice = 5.32 * amount;
			break;
		case(7623):
			finalPrice = 6.45 * amount;
			break;
		default:
			finalPrice = 0;
			break;
		}
		
		if (finalPrice != 0) {
			System.out.printf("The final price is: %.2f\n\n", finalPrice);
		}
		else {
			System.out.println("Invalid code, try again.\n");
			Thirteenth();
		}
		
	}
	
	public static void Fourteenth() {
		/*
		Description: 
		- Ler um número inteiro, e verificar se o número corresponde a um mês válido no
		  calendário e escrever o nome do mês, senão escrever uma mensagem ‘Mês Inválido’.
		- Read an integer number, verify if the number corresponds to a valid month at the
		  calendar and write the name of the month, if not, write "Invalid Month" message.
		*/
		System.out.println("Insert a number: ");
		int number = sc.nextInt();
		
		String month = "january"; // standard attribution, used only to initialize the variable
		
		if (number >= 1 && number <= 12) {
			switch(number) {
			case(1):
				month = "January";
				break;
			case(2):
				month = "February";
				break;
			case(3):
				month = "March";
				break;
			case(4):
				month = "April";
				break;
			case(5):
				month = "May";
				break;
			case(6):
				month = "June";
				break;
			case(7):
				month = "July";
				break;
			case(8):
				month = "August";
				break;
			case(9):
				month = "September";
				break;
			case(10):
				month = "October";
				break;
			case(11):
				month = "November";
				break;
			case(12):
				month = "December";
				break;
			}
			System.out.println("Month: " + month + "\n");
		}
		else {
			System.out.println("Invalid month.\n");
		}
	}
	
	public static void Fifteenth() {
		/*
		Description:
		- A imobiliária “Imobiliares” vende apenas terrenos retangulares. Faça um algoritmo
		  para ler as dimensões de um terreno e depois exibir a área do terreno.
		- The Estate Agency "Imobiliares" sells only retangular terrains. Build an algorithm
		  to read the dimensions of a terrain then show the area of it.
		*/
		System.out.println("Insert the length of the terrain: ");
		double length = sc.nextDouble();
		System.out.println("Insert the width of the terrain: ");
		double width = sc.nextDouble();
		
		double area = length*width;
		
		System.out.printf("The area of the terrain is %.2f\n\n", area);
	}
	
	public static void Sixteenth() {
		/*
		Description: 
		- Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar
		  todos os cavalos comprados para um haras.
		- Write an algorithm to calculate how many horseshoes are required to equip all 
		  bought horses for a stud farm.
		*/
		System.out.println("How many horses are getting bought? ");
		int horses = sc.nextInt();
		
		System.out.println(horses*4 + " horseshoes are required.\n");
	}
	
	public static void Seventeenth() {
		/*
		Description: 
		- A padaria “Pão Bom” vende certa quantidade de pães franceses e uma quantidade de
		  broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia,
		  o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto'
		  deve guardar numa conta de poupança (10% do total arrecadado). Você foi contratado
  	 	  para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler
		  as quantidades de pães e de broas, e depois calcular os dados solicitados.
		- The "Pão Bom" bakery sells certain amounts of breads and 'broas' each day. Each bread cost
		  R$ 0.12 and a 'broa' cost R$ 1.50. At the end of the day, the owner wants to know his daily 
		  earnings and how much he must save for his saving account(10% of his gains). You were hired
		  to calculate it. According to this data, write an algorithm to read the amount of bread and
		  'broas' and after that calculate the required informatio.
		*/
		System.out.println("How many breads were sold? ");
		int breads = sc.nextInt();
		System.out.println("How many 'broas' were sold? ");
		int broas = sc.nextInt();
		
		double gains = breads*0.12 + broas*1.50;
		double savings = gains*0.1;
		
		System.out.println("The total earnings were: " + gains);
		System.out.println("The total saved was: " + savings +"\n");
		
	}
	
	public static void Eighteenth() {
		/*
		Description: 
		- Faça um programa que solicite ao usuário para digitar valores numéricos inteiros
		  positivos. Encerre a entrada de dados quando for digitado um número negativo ou
		  zero. Calcule a média dos números positivos digitados.
		- Write a program which asks a user to type integer positive numeric values. Finish
		  the input when a negative number or zero is typed. Afterwards, calculate the media 
		  of the positive numbers. 
		*/
		
		double number, aux1, aux2, media;
		aux1 = 0; // sum the positive numbers
		aux2 = 0; // sum how many numbers were inserted
		
		
		System.out.println("Type a number: ");
		number = sc.nextDouble();
		
		while (number > 0) {
			aux1 += number;
			aux2 += 1;
			System.out.println("Type a number: ");
			number = sc.nextDouble();
		}
		
		media = aux1/aux2;
		
		System.out.println("The media is: " + media + "\n");
	}
	
	public static void Nineteenth() {   // return in case i need to redo the exercise later only in the imperative programming 
		/*
		Description: 
		- Uma determinada empresa armazena para cada funcionário (10 no total) uma ficha
		  contendo o código, o número de horas trabalhadas e o seu numero de dependentes.
		  Considerando que: A empresa paga 15 reais por hora e 40 reais por dependentes.
		  Sobre o salário são feitos descontos de 8,5% para o INSS e 5% para IR. Faça um
		  programa para ler o código, número de horas trabalhadas e número de dependentes
		  de cada funcionário. Após a leitura, escreva qual o código, os valores descontados
		  para cada tipo de imposto e finalmente o salário líquido de cada um dos funcionários.
		- A company keeps a file(10 in total) containing a code, the total worked hours and the 
		  number of dependents of each employee. Considering the company pays R$15 an hour and 
		  R$ for its dependents. There are made discounts on the employee salary, 8% to the INSS 
		  and 5% to the IR. Write a program to read the code, total worked hours and the number 
		  of dependents of each employee. Afterwards, write its code, the discounted values to
		  each tax and finally the final salary of each employee.
		*/

		ArrayList<Employee> allEmployees = new ArrayList<Employee>();
		
		for (int i = 0; i < 2; i++) {
			System.out.printf("Insert the code of the %dst employee: \n", i+1);
			int employeeCode = sc.nextInt();
			System.out.println("Insert its worked hours: ");
			int employeeHours = sc.nextInt();
			System.out.println("Insert the number of its dependents: ");
			int employeeDependents = sc.nextInt();
			
			Employee emp = new Employee();
			
			emp.code = employeeCode;
			emp.hours = employeeHours;
			emp.dependents = employeeDependents;
			emp.salary = 15*4*emp.hours;
			emp.inss = emp.salary*0.085;
			emp.ir = emp.salary*0.05;
			emp.finalSalary = emp.salary - emp.inss - emp.ir;
			
			allEmployees.add(emp);
		}
		
		for (Employee i : allEmployees) {
			System.out.println(i);
		}
		
	}
	
	public static void Twentieth() {  // return here later
		/*
		Description: 
		- Em uma pesquisa de campo, uma editora solicitou os seguintes dados para os
		  entrevistados: sexo, idade e quantidade de livros que leu no ano atual. Faça um
		  programa que leia os dados digitados pelo usuário, sendo que deverão ser solicitados
 		  dados até que a idade digitada seja um valor negativo.
		  Depois, calcule e imprima:
  			 a) A quantidade total de livros lidos pelos entrevistados menores de 10 anos.
  			 b) A quantidade de mulheres que leram 5 livros ou mais.
  			 c) A média de idade dos homens que leram menos que 5 livros.
  			 d) O percentual de pessoas que não leram livros.
		- A publisher during a research required the following data to the interviewed: 
		  gender, age and the number of read books in the current year. Write an algorithm to
		  read a user's input data, which must be go on until the inserted age is a negative number.
		  Afterwards, calculate and print: 
		    a) The total number of read books by the interwiewed bellow the age of 10.
		    b) The total number of women who read 5 or more books.
		    c) The age range of the men who read less than 5 books.
		    d) The percentage of people who haven't read any books.
		*/
		
		ArrayList<Interviewed> allInterviewed = new ArrayList<Interviewed>();
		
		Interviewed person = new Interviewed();
		double control, totalBooksLessThan10Years, womenWhoReadMoreThan5Books, menWhoReadLessThan5Books, mediaOfMensAgeWhoReadLessThan5Books, noReaders;
		totalBooksLessThan10Years = 0;
		womenWhoReadMoreThan5Books = 0;
		menWhoReadLessThan5Books = 0;
		mediaOfMensAgeWhoReadLessThan5Books = 0;
		noReaders = 0;
		
		do {
			System.out.println("Insert the gender of the interviewed(m/f): ");
			char gender = sc.next().charAt(0);
			Character.toLowerCase(gender);
			System.out.println("Insert the age of the interviewed: ");
			int age = sc.nextInt();
			System.out.println("Insert the amount of read books by the interviewed: ");
			int books = sc.nextInt();
			
			person.gender = gender;
			person.age = age;
			person.books = books;
			
			allInterviewed.add(person);
			
			System.out.println("Would you like to interview another person? If yes, insert a number greater than 0, if not, insert a number less than 0. ");
			control = sc.nextInt();
		} while (control > 0);
		
		for (Interviewed i : allInterviewed) {
			if (i.age < 10) {
				totalBooksLessThan10Years += 1;
			}
			
			if (i.gender == 'f' && i.books >= 5) {
				womenWhoReadMoreThan5Books += 1;
			}

			if (i.gender == 'm' && i.books < 5) {
				menWhoReadLessThan5Books += 1;
				mediaOfMensAgeWhoReadLessThan5Books += i.age;
			}
			
			if (i.books == 0) {
				noReaders += 1;
			}
		}
		
		/* the following conditional prevents the "Not a number" output in case there is no man who read less than 5 books, cause if that is true
		there would be 0 divided by 0, which is mathematically impossible. */
		if (menWhoReadLessThan5Books == 0) {
			mediaOfMensAgeWhoReadLessThan5Books = 0;
		}
		else {
			mediaOfMensAgeWhoReadLessThan5Books = mediaOfMensAgeWhoReadLessThan5Books/menWhoReadLessThan5Books;
		}
		
		// calculates the percentage of no readers.
		noReaders = (noReaders*100)/allInterviewed.size();
		
		System.out.println("The total number of books read by interviewed younger than 10 years is: " + totalBooksLessThan10Years);
		System.out.println("The total number of women who read 5 or more books is: " + womenWhoReadMoreThan5Books);
		System.out.println("The age range of men who read less than 5 books is: " + mediaOfMensAgeWhoReadLessThan5Books);
		System.out.println("The percentage of people who read no books is: " + noReaders);
	}
	
	public static void TwentyFirst() {
		/*
		Description: 
		- Foi realizada uma pesquisa com 200 pessoas que assistiram uma peça de teatro, em
  		  relação a sua opinião sobre a mesma. Cada espectador respondeu a um questionário
   		  que solicitava os seguintes dados:
				idade da pessoa;
				o identificador da pessoa;
				opinião em relação à peça(de 0 a 10).
		  Faça um programa que, a partir destes dados, calcule e imprima:
				a.A quantidade de respostas 10.
				b.A média de idade das pessoas que responderam o questionário.
				c.A percentagem de pessoas que responderam 5 ou menos para a opinião da peça.
				d.O identificador da pessoa mais velha.
		  * Considere que a maior idade não é repetida. 
		- A survey was carried out with 200 people who watched a theatre play, in
  		  regarding their opinion on it. Each viewer answered a questionnaire
   		  which requested the following data:
				age of the person;
				the person's identifier;
				its opinion on the play (from 0 to 10).
		  Write a program that, based on this data, calculates and prints:
				a.The number of people who rated 10.
				b.The age range of the people who answered the questionnaire.
				c.The percentage of people who rated 5 or less to the play.
				d.The identifier of the oldest person.
		  * Consider that the oldest age is not repeated.
		*/
		ArrayList<Theatre> allInterviewed = new ArrayList<Theatre>();
	
		int answersTen = 0;
		double ageMedia = 0;
		double fiveOrLess = 0;
		int olderIdentifier = 0;
		
		for (int i = 0; i < 2; i++) {
			System.out.printf("Insert the age of the %dst interviewed: ", i+1);
			int age = sc.nextInt();
			System.out.printf("Insert the identifier of the interviewed: ");
			int identifier = sc.nextInt();
			System.out.printf("Insert the opinion rate of the interviewed(0-10): ");
			int rate = sc.nextInt();
			System.out.println(); // used only for styling reasons 
			
			Theatre interviewed = new Theatre();
			interviewed.age = age;
			interviewed.identifier = identifier;
			interviewed.opinionRate = rate;
			
			allInterviewed.add(interviewed);
		}
		
		for (int i = 0; i < allInterviewed.size(); i++) {
			ageMedia += allInterviewed.get(i).age; // sum all the interviewed ages
			
			if (allInterviewed.get(i).opinionRate == 10) {  // counts the number of interviewed who rated 10
				answersTen += 1;
			}
			
			if (allInterviewed.get(i).opinionRate <= 5) { // counts the number of interviewed who rated 5 or less
				fiveOrLess += 1;
			}
			
			if (i == 0) { 
				olderIdentifier = allInterviewed.get(i).identifier;
			}
			else {
				if (allInterviewed.get(i).age > allInterviewed.get(i-1).age) { // if the 
					olderIdentifier = allInterviewed.get(i).identifier;
				}
			}
		}
		
		ageMedia = ageMedia/allInterviewed.size();
		fiveOrLess = (fiveOrLess*100)/allInterviewed.size();
		
		System.out.printf("The amount of people who rated 10 is: %d\n", answersTen);
		System.out.printf("The age range of the participants is: %.1f\n", ageMedia);
		System.out.printf("The percentage of people who rated 5 or less is: %.1f%%\n", fiveOrLess);
		System.out.printf("The older identifier is: %d\n\n", olderIdentifier);
		
	}
	
	public static void TwentySecond() { 
		/*
		Description: 
		- Foi feita uma pesquisa para saber o perfil dos alunos que cursam o ginásio de uma
		  determinada escola. Cada aluno fornecia a sua série (primeira-1, segunda-2, terceira-3 
		  ou quarta-4), quantos livros liam por mês e se gostavam de fazer redação (Sim-1 ou 
		  Não-0). Fazer um programa que leia os dados, calcule e imprima:
			  A quantidade de alunos que está na terceira série;
  			  A maior quantidade de livros lidos por um aluno que está na quarta série;
   			  A porcentagem de alunos que não gostam de fazer redação e que estão na terceira série.
		  OBS: A condição de parada (flag) é que seja digitado 0 (zero) para série.
		- A survey was carried out to find out the profile of students who attend the sixth form of a
		  specific school. Each student provided their grade (first-1, second-2, third-3
		  or fourth-4), how many books they read per month and whether they liked to write essays (Yes-1 or
		  Not-0). Write a program that reads the data, calculates and prints:
			  The number of students in third grade;
			  The greater number of books read by a fourth grade student;
   			  The percentage of students who do not like writing essays and are in third grade.
		  NOTE: The stop condition (flag) is that 0 (zero) is entered for grade.
		 */
		
		int thirdGrade, greaterFourthGrade;
		double noEssayEnjoyment;
		thirdGrade = 0;
		noEssayEnjoyment = 0;
		greaterFourthGrade = 0;
		
		ArrayList<Students> allStudents = new ArrayList<Students>();
		
		while (true) {
			System.out.printf("Insert the grade of the student(first-1, second-2, third-3, fourth-4), insert 0 to finish.: ");
			int grade = sc.nextInt();
			if (grade == 0) {
				break;
			}
			System.out.printf("Insert the number of monthly read books by the stydents: ");
			int books = sc.nextInt();
			System.out.printf("Do they like to write essays?(yes-1, no-0): ");
			int essay = sc.nextInt();
			
			Students student = new Students();
			
			student.grade = grade;
			student.readBooks = books;
			student.essayEnjoyment = essay;
			
			allStudents.add(student);
		} 
		
		for (int i = 0; i < allStudents.size(); i++) {
			if (allStudents.get(i).grade == 3) {
				thirdGrade += 1;
			}
			
			if (allStudents.get(i).grade == 4) {
				if (i == 0) {
					greaterFourthGrade = allStudents.get(i).readBooks;
				}
				else if (allStudents.get(i).readBooks > allStudents.get(i-1).readBooks) {
					greaterFourthGrade = allStudents.get(i).readBooks;
				}
			}
			
			if (allStudents.get(i).essayEnjoyment == 0) {
				noEssayEnjoyment += 1;
			}
		}
		
		noEssayEnjoyment = noEssayEnjoyment*100/allStudents.size();
		
		System.out.printf("The number of students in the third grade is: %d\n", thirdGrade);
		System.out.printf("The greater number of books read by a fourth grade is: %d\n", greaterFourthGrade);
		System.out.printf("The percentage of students whom have no enjoyment on writing essays is: %.1f\n\n", noEssayEnjoyment);
		
	}
	
	public static void TwentyThird() {  // ask the professor a few questions from here
		/*
		Description: 
		- Uma empresa realizou uma pesquisa com os seus fornecedores, na qual foram
		  coletados os seguintes dados referentes aos produtos fornecidos: Id, Valor e
		  Percentual de aumento.
		  Obs: Se o produto não tiver sofrido alteração de preço, o percentual de aumento será igual a 0.
		  Faça um programa que determine e escreva:
			 O novo valor de cada um dos produtos.
			 A quantidade de produtos mais caros que R$ 100,00 (após aumento) e que tiveram aumento superior a 5%.
			 A média de valor dos produtos que não sofreram aumento.
			 O valor do produto mais caro (após aumento).
		  Obs: o programa solicita dados até que o ID digitado seja zero.
		- A company carried out a survey with its suppliers, in which there was
		  collected the following data relating to the products supplied: Id, Value and
		  percentage of increase.
		  Note: If the product has not changed its price, the percentage of increase will be equal to 0.
 		  Write a program that determines and prints:
			 The new value of each product.
			 The number of products more expensive than R$100.00 (after increase) and which increased by more than 5%.
			 The average value of products that did not increase.
			 The value of the most expensive product (after increase).
		  Note: the program requests data until the entered ID is zero.
		*/
		int id = 0;
		ArrayList<SupplyData> products = new ArrayList<SupplyData>();
		
		// why can't I declarate the SupplyData product here?(outside of the for loop) (i've tried before and
		// it seems the inner values are not properly pushed into the array, for some reason it repeats only the first)
		
		while (true) {
			System.out.printf("Insert the ID of the product(0 to finish): ");
			id = sc.nextInt();
			if (id == 0) {
				break;
			}
			System.out.printf("Insert the value of the product: ");
			double value = sc.nextDouble();
			System.out.printf("Insert the percentage of increase: ");
			double percentage = sc.nextDouble();
			
			SupplyData product = new SupplyData();
			
			product.id = id;
			product.value = value;
			product.increasePercentage = percentage;
			product.newValue = (value*(100+percentage))/100;
			
			products.add(product);
		} 
		
		for (SupplyData i : products) {  // prints the new value of each product
			System.out.printf("Product ID: %d; New value: %.2f\n", i.id, i.newValue);
		}
		
		int moreExpensiveThan100 = 0;
		double average = 0; // average and aux are used to calculate the average of value
		int aux = 0;
		double mostExpensive = 0; // most expensive product
		
		for (SupplyData i : products) {
			if (i.newValue > 100 && i.increasePercentage > 5.0) {
				moreExpensiveThan100 += 1;
			}
			
			if (i.increasePercentage == 0) {
				average += i.value;
				aux += 1;
			}
			
			if (i.newValue > mostExpensive) {
				mostExpensive = i.newValue;
			}
		}
		
		if (aux == 0) {
			average = 0;
		}
		else {
			average = average/aux;
		}
		
		System.out.println("The number of products more expensive than R$100 and which had more tha 5% of increse is: " + moreExpensiveThan100);
		System.out.printf("The average value of products that did not increase is: %.2f\n", average);
		System.out.printf("The value of the most expensive product is: %.2f\n\n", mostExpensive);
	}
	
	public static void TwentyFourth() {
		/*
		Description: 
		- Escreva um algoritmo em Java que determine se dois valores inteiros e positivos A e
		  B são primos entre si. (dois números inteiros são ditos primos entre si, caso não exista
		  divisor comum aos dois números).
		- Write an algorithm in Java which determines if two positive integer numbers A and B are primes
		  to themselves. (two integer numbers are primes to themselves if there is not a commom divisor 
		  to both of them)
		*/
		System.out.printf("Insert a number: ");
		int a = sc.nextInt();
		System.out.printf("Insert another number: ");
		int b = sc.nextInt();
		
		PrimesToThemselves primesToThemselves = new PrimesToThemselves();
		
		System.out.println(primesToThemselves.PrimesToEachOther(a, b));
	}
	
	public static void TwentyFifth() {
		/*
		Descrição: 
		- Escreva um algoritmo em Java para calcular o fatorial do número N, cujo valor é
		  obtido através do usuário pelo teclado.
		- Write an algorithm in Java to calculate the factorial of a N number.
		*/
		System.out.printf("Insert a number N to calculate its factorial: ");
		int n = sc.nextInt();
		System.out.println(); // only for aesthetics in the console xD
		
		Factorial calculatesFactorial = new Factorial();
		
		System.out.println("The factorial of " + n + " is: " + calculatesFactorial.calculatesFactorial(n) + "\n");
	}
	
	public static void TwentySixth() {
		/*
		Description: 
		- Escreva um algoritmo em Java que determine todos os divisores de um dado número N. 
		- Write an algorithm in Java that determines all the divisors of a given number N.
		*/
		System.out.printf("Insert a number: ");
		int n = sc.nextInt();
		
		AllDivisors divisors = new AllDivisors();
		System.out.println(divisors.divisors(n));
	}
	
	public static void TwentySeventh() {
		/*
		Descrição: 
		- Escreva um algoritmo em Java que determine se um dado número N (digitado pelo
		  usuário) é primo ou não.
		- Write an algorithm in Java that calculates if a given N number(typed by user) is prime or not.
		*/
		System.out.println("Insert a number N: ");
		int n = sc.nextInt();
		
		PrimeNumber prime = new PrimeNumber();
		
		System.out.println(prime.isPrime(n));
		
	}
	
	public static void Thirty() {
		/*
		Description: 
		- A série de Fibonacci é formada pela sequência: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,...
		- The Fibonacci serie is formed by the sequence: 1, 1, 2, 3, 5, 8, 13, 21, 24, 55,...
		*/
		System.out.printf("Insert a number: ");
		int n = sc.nextInt();
		
		Fibonacci fibonacciSerie = new Fibonacci();
		System.out.println(fibonacciSerie.fibonacci(n));
		System.out.println();
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
	
	public static void FiftyEighth() {
		/*
		Description: 
		- Calcule o volume de uma caixa d'água cilíndrica.
		- Calculate the volume of a cylindrical water tank.
		*/
		System.out.printf("Insert the radio of the tank: ");
		double r = sc.nextDouble();
		System.out.printf("Insert the height of the tank: ");
		double h = sc.nextDouble();
		
		double volume = Math.PI*Math.pow(r, 2)*h;
		System.out.printf("The volume of the tank is: %.1f cubic meters.\n\n", volume);
	}

	public static void FiftyNineth() {
		/*
		Description: 
		- Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, 
		  sabendo-se que este sofreu um desconto de 10%.
		- Write a program that receives the price of a product, then calculates and prints the new
		  price with a 10% discount.
		*/
		System.out.printf("Insert the price of the product: ");
		double price = sc.nextDouble();
		
		double newPrice = price*0.90;
		System.out.printf("The new price is: R$%.2f\n\n", newPrice);
	}
	
	public static void Sixtieth() {
		/*
		Description: 
		- Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça
		  um programa que receba o salário fixo de um funcionário e o valor de suas vendas,
		  calcule e mostre a comissão e o salário final do funcionário.
		- An employee receives a fixed salary plus 4% commission on sales. Write
		  a program that receives an employee's fixed salary and the value of their sales, it then
		  calculates and prints the employee's commission and final salary.
		*/
		System.out.printf("Insert the employee's fixed salary: ");
		double salary = sc.nextDouble();
		System.out.printf("Insert the employee's sales value: ");
		double sales = sc.nextDouble();
		
		double commission = sales*0.04;
		
		System.out.printf("The employee's comsission is: R$%.2f\n", commission);
		System.out.printf("The final salary is: R$%.2f\n\n", salary+commission);
		
	}
	
}
