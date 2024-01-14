// question 26
package UsedClasses;

import java.util.ArrayList;

public class AllDivisors {
	public ArrayList<Integer> divisors (int n) {
		ArrayList<Integer> allDivisors = new ArrayList<Integer>(); 
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				allDivisors.add(i);
			}
		}
		
		return allDivisors;
	}
}
