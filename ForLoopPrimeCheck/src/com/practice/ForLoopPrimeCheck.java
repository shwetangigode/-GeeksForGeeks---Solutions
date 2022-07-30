package com.practice;

public class ForLoopPrimeCheck {
	//
	static String isPrime(int n) {
		if (n == 1) {
			return "No";
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return "No";
			}
		} // for
		return "Yes";
	}// isPrime()

	public static void main(String[] args) {
		String isPrime = isPrime(15);
		System.out.println(isPrime);
	}// main()

}// class
