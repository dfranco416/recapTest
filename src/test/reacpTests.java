package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.MathUtil;

class reacpTests {
	
	MathUtil calc;
	
	@BeforeEach
	void setUp() {
		calc = new MathUtil();
	}

	@Test
	void testCircumference() {
		int radius = 4;
//		expected
		double expected = 2 * Math.PI * radius;
//		actual
		double actual = calc.circumference(radius);
//		verify
		assertEquals(actual, expected, "Doesn't give the right circumference");
	}
	@Test
	void testAdd() {
		int expect = 2;
		int actual = calc.add(1,1);
		assertEquals(expect, actual);
	}

}
