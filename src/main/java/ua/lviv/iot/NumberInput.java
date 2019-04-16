package ua.lviv.iot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberInput {
	private String input;
	private int sum;
	private List<String> number = new ArrayList<>();
	private String numberPattern = "\\d+";

	public NumberInput(String input) {
		this.input = input;
	}

	public void setInput(String input) {
		this.input = input;
	}


	public List<String> findNumber() {
		Pattern pattern = Pattern.compile(numberPattern);
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			sum += matcher.groupCount();
			number.add(matcher.group());
			System.out.println(sum);

		}
		return number;
	}

	public void showResults() {
		System.out.println("I found: ");
		System.out.println(this.findNumber());
	}

	public static String readInputNumber() {
		System.out.print("Enter String\n");
		try (Scanner scanner = new Scanner(System.in)) {
			return scanner.nextLine();
		}
	}

}
