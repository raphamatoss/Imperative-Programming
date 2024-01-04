import java.util.Scanner;
import java.util.Locale;

public class ConditionalExercises {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("Choose which assigment you would like to try: ");
			System.out.println("1.....Conversor of Millimiters to Inches and reverse.");
			System.out.println("2.....Square of a number.");
			System.out.println("3.....Costumer's car cost.");
			System.out.println("4.....Restaurant Order");
			System.out.println("0.....to exit.");
			choice = sc.nextInt();
			
			switch(choice) {
			case (1):
				MillimetersAndInches();
				break;
			case (2):
				SquareNumber();
				break;
			case (3):
				CostumersCarCost();
				break;
			case(4):
				RestaurantOrder();
				break;
			default:
				System.out.println("Invalid number.");
				break;
			}
		} while (choice != 0);
		
		sc.close();
	}
	
	public static void MillimetersAndInches() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nWould you like to convert to millimeters or to inches(m/i)? ");
		char convert = sc.next().charAt(0);
		System.out.println("Insert the value: ");
		double value = sc.nextDouble();
		
		double standard = 25.4; // 1 inch equals to 24.4 millimeters
				
		if (convert == 'm') {
			System.out.println(value + " inches equals to " + value*standard + " millimeters.\n");
		}
		else {
			System.out.println(value + " millimeters equals to " + value/standard + " inches.\n");
		}
	}
	
	public static void SquareNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nInsert a number: ");
		int number = sc.nextInt();
		
		System.out.printf("The square of %d is %d\n\n", number, number*number);
	}
	
	public static void CostumersCarCost() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nInsert the production cost a car: ");
		double productionCost = sc.nextDouble();
		
		double costumersCost = productionCost + productionCost*0.12 + productionCost*0.45;
		System.out.println("The costumer's cost of the car is: " + costumersCost + ".\n");
	}
	
	public static void RestaurantOrder() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nBurger..........$3.0");
		System.out.println("Cheeseburger....$2.5");
		System.out.println("Chips...........$2.5");
		System.out.println("Soda............$1.0");
		System.out.println("Milkshake.......$3.0");
		
		System.out.println("Any burgers?");
		int burgers = sc.nextInt();
		System.out.println("Any cheeseburgers?");
		int cheeseburgers = sc.nextInt();
		System.out.println("Any chips?");
		int chips = sc.nextInt();
		System.out.println("Any soda?");
		int soda = sc.nextInt();
		System.out.println("Any milkshake?");
		int milkshake = sc.nextInt();
		
		double total = burgers*3 + cheeseburgers*2.5 + chips*2.5 + soda*1 + milkshake*3;
		
		System.out.println("\nRecipe..........");
		System.out.println("Total.........$" + total + "\n");
		
	}
	
}