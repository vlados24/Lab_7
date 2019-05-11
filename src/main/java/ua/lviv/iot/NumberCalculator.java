package ua.lviv.iot;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberCalculator {
	private String numberPattern = "[0-9.-]+";
	private String input;
	private Integer sum;
	private List<Integer> number = new ArrayList<>();
	public List<Integer> getNumber() {
		return number;
	}

	public void setNumber(List<Integer> number) {
		this.number = number;
	}

	public NumberCalculator(String input) {
		this.input = input;
	}

	public void setInput(String input) {
		this.input = input;
	}


	public List<Integer> findNumber() {
		Pattern pattern = Pattern.compile(numberPattern);
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			String s = matcher.group();
			System.out.println(s);
			number.add(Integer.parseInt(s));
		}
		return number;
	}

	public int showResults() {
		sum = 0;
		for (Integer num : findNumber()) {
			sum += num;
		}
		System.out.println("Sum is " + sum.toString());
		return sum;
	}



}
