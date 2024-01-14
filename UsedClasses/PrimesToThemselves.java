// question 24
package UsedClasses;

public class PrimesToThemselves {
	public boolean PrimesToEachOther (int a, int b) {
		
		int n = a > b ? b : a; // it collects the smallest number
		boolean control = true;
		
		for (int i = 2; i <= n; i++) {
			if (a % i == 0 && b % i == 0) {
				control = true;
				break;
			}
			else {
				control = false;
			}
		}
		
		return control;
	}
}
