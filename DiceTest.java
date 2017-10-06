package Terninger;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {

	Dice terning;
	int count ;
	
	@Before
	public void setUp() throws Exception {
		terning = new Dice();
		count = 0;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test //denne her test viser at ud af 100000 gange, så kommer der ikke en 
	// eneste værdi som ikke er mellem 1 og 6 
	public void testAfVærdier() {
		boolean expected = false;
		boolean actual = false;
		while(count<100000) {
			if (terning.roll()>6 || terning.roll()<1) {
				actual = true;
						} count++;
				}
		assertEquals(expected, actual);
		
	}

}
