package lambdaenumanno;

// enum

enum Cards {
	HEART, CLUB, SPADE, DIAMOND;
}

public class Code148 {
	public static void main(String[] args) {
		Cards cd;
		cd = Cards.DIAMOND;
		System.out.println("Value of cd: " + cd);
		
		// change
		cd = Cards.SPADE;
		
		// switch
		switch (cd) {
		case HEART:
			System.out.println("Heart card");
			break;
		case CLUB:
			System.out.println("Club card");
			break;
		case SPADE:
			System.out.println("Spade card");
			break;
		case DIAMOND:
			System.out.println("Diamond card");
			break;
		}
		
		
		// values & valueOf
		System.out.println("Print out all cards");
		System.out.println("-------------------");
		Cards all[] = Cards.values();
		for (Cards c: all)
			System.out.println(c + ":" + c.ordinal()); // ordinal
		
		System.out.println("-------------------");
		cd = Cards.valueOf("CLUB");
		System.out.println("cd is " + cd);
		
		
		// compareTo
		Cards cd1, cd2, cd3;
		
		cd1 = Cards.HEART;
		cd2 = Cards.SPADE;
		cd3 = Cards.HEART;
		
		if (cd1.compareTo(cd2) < 0) System.out.println("cd1 < cd2");
		else if (cd1.compareTo(cd2) == 0) System.out.println("cd1 == cd2");
		else System.out.println("cd1 > cd2");
		
		if (cd1.compareTo(cd3) == 0) System.out.println("cd1 == cd3");
		else System.out.println("cd1 != cd3");
	}
}
