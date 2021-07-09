package com.qa.factorial;

public class Factorial {

	public String factorial(int num) {
		float currentNum = num;

		for (int i = 1; i <= num; i++) {
			currentNum /= i;

			if (currentNum == 1) {
				return num + " = " + i + "!";
			} else if (currentNum < 1) {
				break;
			}
		}

		return num + " NONE";
	}
}
