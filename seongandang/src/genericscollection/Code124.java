package genericscollection;

class Data2<T extends Number> {
	T obj;
	
	Data2(T obj) {
		this.obj = obj;
	}
	
	int calcMultiple(int n) {
		return obj.intValue() * n;
	}
}

public class Code124 {
	public static void main(String[] args) {
		Data2<Integer> d = new Data2<Integer>(100);
		int result1 = d.calcMultiple(5);
		System.out.println(result1);
		
		Data2<Double> e = new Data2<Double>(17.5);
		int result2 = e.calcMultiple(5);
		System.out.println(result2);
	}
}
