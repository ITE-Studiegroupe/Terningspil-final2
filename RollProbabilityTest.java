package terning;
import terning.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RollProbabilityTest {
	Dice dice;

	@Before
	public void setUp() throws Exception {
		dice = new Dice();
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[] face = new int[6];
		boolean[] expecteds = new boolean[] {true,true,true,true,true,true};
		boolean[] actuals = new boolean[expecteds.length];
		
		for(int i = 0; i<60000; i++) {
			switch(dice.roll()) {
			case 1:
				face[0]++;
				break;
			case 2:
				face[1]++;
				break;
			case 3:
				face[2]++;
				break;
			case 4:
				face[3]++;
				break;
			case 5:
				face[4]++;
				break;
			case 6:
				face[5]++;
				break;
			}
		}
		
		for(int i = 0; i < face.length; i++) {
			System.out.println(face[i]);
			if (face[i] < 9600 || face[i] > 10400) actuals[i] = false;
			else actuals[i] = true;
		}
		
		assertArrayEquals(expecteds, actuals);
		/*Testen fejler fordi 1 og 6 konsekvent kun bliver slået ca. 50% mindre gange end de andre.
		 * Årsgaen til det er den måde terningkastet bliver udregnet, idet der rundes halveres sandsynligheden
		 * for de ydre tal 1 og 6 */
	}

}
