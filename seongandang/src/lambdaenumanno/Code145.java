package lambdaenumanno;

// one line lambda expression

interface MyValue1 {
	int getValue();
}

interface MyValue2 {
	double getValue();
}

interface MyValue3 {
	double getDivision(int n);
}

interface MyValue4 {
	boolean getValue(int n);
}

interface Test {
	boolean test(int n, int m);
}

public class Code145 {
	public static void main(String[] args) {
		// no parameter, return int
		MyValue1 mv1;
		mv1 = () -> 100;
		System.out.println("*** () -> 100 ***");
		System.out.println(mv1.getValue()); // 100
		
		// no parameter, return double
		MyValue2 mv2;
		mv2 = () -> 100.5;
		System.out.println("*** () -> 100.5 ***");
		System.out.println(mv2.getValue()); // 100.5
		
		// 1 int parameter, return double
		MyValue3 mv3;
		mv3 = (n) -> 1.0 / n;
		System.out.println("*** (n) -> 1.0 / n ***");
		System.out.println(mv3.getDivision(5));    // 0.2
		System.out.println(mv3.getDivision(10));   // 0.1
		System.out.println(mv3.getDivision(100));  // 0.01
		System.out.println(mv3.getDivision(2000)); // 5.0E-4
		
		// 1 int parameter, return boolean
		MyValue4 mv4;
		mv4 = (n) -> (n % 2) == 0;
		System.out.println("*** (n) -> (n % 2) == 0 ***");
		System.out.println(mv4.getValue(50)); // true
		System.out.println(mv4.getValue(25)); // false
		
		// 2 int parameter, return boolean
		// 1 interface, 2 lambda expression
		Test t1 = (n, d) -> (n % d) == 0;
		System.out.println("*** (n, d) -> (n % d) == 0 ***");
		if (t1.test(10, 5)) System.out.println("5 is a factor of 10");
		else System.out.println("5 is not a factor of 10");
		// 5 is a factor of 10
		if(t1.test(10, 3)) System.out.println("3 is a factor of 10");
		else System.out.println("3 is not a factor of 10");
		// 3 is not a factor of 10
		
		Test t2 = (n, m) -> (n < m);
		System.out.println("*** (n, m) -> (n < m) ***");
		if (t2.test(3, 5)) System.out.println("3 is less than 5");
		else System.out.println("3 is bigger than 5");
		// 3 is less than 5
		if (t2.test(10, 4)) System.out.println("10 is less than 4");
		else System.out.println("10 is bigger than 4");
		// 10 is bigger than 4
	}
}
