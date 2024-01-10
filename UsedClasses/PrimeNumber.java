package UsedClasses;

public class PrimeNumber {
	
	public boolean isPrime(int n) {
		boolean primes[] = new boolean[n + 1];
		
		for (int i = 2; i <= n; i++) {
			primes[i] = true;
		}
		
		// gets all the prime numbers till the number N using the Sieve of Eratosthenes
		for (int i = 2; i <= n; i++) {
			if (primes[i] == true) {
				for (int j = i+i; j <= n; j += i) {
					primes[j] = false;
				}
			}
		}

		// it then analyze if the number N is true or not, if true, it's a prime! ;D 
		if (primes[n] == true) {
			return true;
		}
		else {
			return false;
		}

	}
}
