package method;

import java.util.Arrays;

public class Code41 {
	static void updateArray(int[] B) {
		for (int i=0; i<B.length; i++) {
			B[i] += 10;
		}
	}
	
	public static int[] makeArray(int size) {
		int A[] = new int[size];
		for (int i=0; i<size; i++) {
			A[i] = i * i;
		}
		return A;
	}
	
	public static void main(String[] args) {
		int[] A = {3, 5, 1, 9, 8, 10};
		System.out.println(Arrays.toString(A));
		updateArray(A);
		System.out.println(Arrays.toString(A));
		
		int s = 5;
		int B[] = makeArray(s);
		System.out.println(Arrays.toString(B));
	}
}
