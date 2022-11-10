package interfacenew;

// default method in interfacee

public class Code87 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();
		t1.show();
		
		Test2 t2 = new Test2();
		System.out.println("t2.getNext(): " + t2.getNext());
		Test3 t3 = new Test3();
		System.out.println("t3.getNext(): " + t3.getNext());
	}
}
