package lambdaenumanno;

// enum with constructor

enum CardsB {
	HEART(10), CLUB(20), SPADE(30), DIAMOND(40);
	
	private int val;
	CardsB(int v) {val = v;}
	int getVal() {return val;}
}

public class Code149 {
	public static void main(String[] args) {
		System.out.println("Value of SPADE: " + CardsB.SPADE.getVal());
		System.out.println("-----------------------------------------");
		System.out.println("All values of CardsB");
		
		for (CardsB c: CardsB.values())
			System.out.println(c + " value: " + c.getVal());
	}
}
