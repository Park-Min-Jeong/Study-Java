package arraytest;

import java.util.Arrays;

public class Code31 {
	public static void main(String[] args) {
		int[] a1 = new int[] {12, 24, 36, 48, 60};
		int a2[] = new int[] {10, 20, 30, 40, 50, 60, 70}; 
		
		// printing with for loop
		for (int i=0; i < a1.length; i++)
			System.out.print(a1[i] + " ");
		System.out.println();
		for (int i=0; i < a2.length; i++)
			System.out.print(a2[i] + " ");
		System.out.println();
		/* 12 24 36 48 60 
		 * 10 20 30 40 50 60 70 */
		
		//printing with Arrays.toString()
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		/* [12, 24, 36, 48, 60]
		 * [10, 20, 30, 40, 50, 60, 70] */
		
		
		// reference value
		int[] a3 = new int[5];
		double[] a4 = new double[6];
		
		byte[] a5 = new byte[7];
		short[] a6 = new short[8];
		char[] a7 = new char[9];
		long[] a8 = new long[10];
		float[] a9 = new float[11];
		
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		
		/* [I@3941a79c
		 * [D@506e1b77
		 * [B@4fca772d
		 * [S@9807454
		 * 
		 * [J@3d494fbf
		 * [F@1ddc4ec2 */
		
		
		// copying array
		int[] original = {4, 2, 9, 7, 10, 3};
		int[] destination = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.arraycopy(original, 2, destination, 4, 3);
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(destination));
		/* [4, 2, 9, 7, 10, 3]
		 * [0, 1, 2, 3, 9, 7, 10, 7, 8, 9] */
		
		
		// assigning array
		int[] data1 = {4, 2, 9, 10, 1};
		int[] data2;
		data2 = data1;
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		/* data1: [I@133314b
		 * data2: [I@133314b */
		
		data1[2] = 500;
		System.out.println("data1: " + Arrays.toString(data1));
		System.out.println("data2: " + Arrays.toString(data2));
		/* data1: [4, 2, 500, 10, 1]
		 * data2: [4, 2, 500, 10, 1] */
	}
}
