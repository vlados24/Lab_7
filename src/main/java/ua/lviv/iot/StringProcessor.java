package ua.lviv.iot;

import java.util.Scanner;

public class StringProcessor {

	public static void main(String[] args) {

		String input = readInputNumber();
		NumberCalculator text = new NumberCalculator(input);
		text.showResults();
	}
	
	public static String readInputNumber() {
		System.out.print("Enter String\n");
		try (Scanner scanner = new Scanner(System.in)) {
			return scanner.nextLine();
		}
	}

}