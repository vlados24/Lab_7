package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.NumberCalculator;

class StringProcessorTest {

	NumberCalculator numberInput;

	@Test
	void getDateTest() {
		numberInput = new NumberCalculator("vass4fd ttre 45 rfgh 56 09 123 por");
		assertEquals(237, numberInput.showResults());
	}
}
