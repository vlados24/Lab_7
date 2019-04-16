package ua.lviv.iot;

public class StringProcessor {

	public static void main(String[] args) {

		String input = NumberInput.readInputNumber();
		NumberInput text = new NumberInput(input);
		text.showResults();

	}

}