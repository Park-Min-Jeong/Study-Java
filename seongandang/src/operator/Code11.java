package operator;

public class Code11 {
	public static void main(String[] args)
	{
		int a = 30, b = 7;
		int r1, r2, r3, r4, r5;
		
		r1 = a + b;
		r2 = a - b;
		r3 = a * b;
		r4 = a % b;
		r5 = a / b;
		
		System.out.println("r1: " + r1); // 37
		System.out.println("r2: " + r2); // 23
		System.out.println("r3: " + r3); // 210
		System.out.println("r4: " + r4); // 2
		System.out.println("r5: " + r5); // 4
		
		
		/* digits */
		int n = 2753;
		int d1000, d100, d10, d1;
		d1000 = n / 1000;
		n = n % 1000;
		d100 = n / 100;
		n = n % 100;
		d10 = n / 10;
		d1 = n % 10;
		
		System.out.println("digits 1000: " + d1000); // 2
		System.out.println("digits 100: " + d100); // 7
		System.out.println("digits 10: " + d10); // 5
		System.out.println("digits 1: " + d1); // 3
		
		
		/* second -> minute, hour, day */
		int seconds = 371921;
		int day = seconds / (24 * 60 * 60);
		int hour = (seconds / (60 * 60)) % 24;
		int min = (seconds / 60) % 50;
		int sec = seconds % 60;
		
		System.out.println(day + "d " + hour + "h " + min + "m " + sec + "s");
		
		
		/* Fahrenheit -> Celsius */
		double f = 72.5;
		double c = (f - 32.0) / 1.8;
		System.out.println("Fahrenheit " + f + " -> " + "Celcius " + c);
	}
}
