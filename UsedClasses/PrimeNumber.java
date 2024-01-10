package UsedClasses;

public class PrimeNumber {
	
	public boolean isPrime(int n) {
		boolean primes[] = new boolean[n + 1];
		
		for (int i = 2; i <= n; i++) {
			primes[i] = true;
		}

		for (int i = 2; i <= n; i++) {
			if (primes[i] == true) {
				System.out.println(i);
				System.out.println(primes[i]);
				for (int j = i; j <= n; j += i) {
					primes[j] = false;
				}
			}
		}

		// idk why but it doesnt work as expected?
		if (primes[n] == true) {
			System.out.println(n);
			return true;
		}
		else {
			System.out.println(n);
			return false;
		}

	}
}
