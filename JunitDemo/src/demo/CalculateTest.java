package demo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculateTest {

	int expected = 0;
	int input1 = 0;
	int input2 = 0;

	@Parameters
	public static Collection<Object[]> t() {
		return Arrays.asList(new Object[][] { { 1, 0, 1 }, { 2, 1, 1 } });
	}

	@Test
	public void testAdd() {
		assertEquals(expected, new Calculate().add(input1, input2));
	}

	public CalculateTest(int expected, int input1, int input2) {
		this.expected = expected;
		this.input1 = input1;
		this.input2 = input2;
	}

}
