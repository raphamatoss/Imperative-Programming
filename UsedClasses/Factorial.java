package UsedClasses;

public class Factorial {
	public int calculatesFactorial (int f) {
		if (f == 0) {
			return 1;
		}
		else {
			return f*calculatesFactorial(f-1);
		}
	}
}
