package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
//		float d1=(float)Math.random();     // 0-1
//		float d2=d1*5;                     // 0-5
//		int d3=Math.round(d2);             // 0-5 integer
//		return d3 + 1;                     // 1-6		
		return (int)(Math.random()*6+1); //løsning
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
//		for (int i=1; i<n; i++) {
//			System.out.print(roll() + " ");
//
//		}		
		for (int i=1; i<=n; i++) { //Nu kører loopet n antal gange
			System.out.print(roll() + " ");

	}
}
