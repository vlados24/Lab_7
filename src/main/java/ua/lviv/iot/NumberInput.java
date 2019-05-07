package ua.lviv.iot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberInput {
	private String input;
	private Integer sum;
	private List<Integer> number = new ArrayList<>();
	private String numberPattern = "\\d+";

	public NumberInput(String input) {
		this.input = input;
	}

	public void setInput(String input) {
		this.input = input;
	}


	public List<Integer> findNumber() {
		Pattern pattern = Pattern.compile(numberPattern);
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			number.add(Integer.parseInt(matcher.group()));
		}
		return number;
	}

	public void showResults() {
		sum = 0;
		for (Integer num : findNumber()) {
			sum += num;
		}
		System.out.println("Sum is " + sum.toString());
	}

	public static String readInputNumber() {
		System.out.print("Enter String\n");
		try (Scanner scanner = new Scanner(System.in)) {
			return scanner.nextLine();
		}
	}

}
