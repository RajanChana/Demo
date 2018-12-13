package com.qa.Factorial;
public class Description {
	public static String factorial(int arg1) {
		int newNumber = arg1;
		for (int i = 2; i < arg1; i++) {
			if (newNumber % i == 0 && newNumber / i == 1) {
				return (String.valueOf(arg1) + "=" + String.valueOf(i) + "!");
			} else if (newNumber % i == 0) {
				newNumber = newNumber / i;
			} else if (newNumber % i != 0) {
				return (String.valueOf(arg1) + " NONE");
			}
		}
		return ("Type a number greater than or equal to 0");
	}
}
