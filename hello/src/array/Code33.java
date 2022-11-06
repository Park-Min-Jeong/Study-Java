package array;

public class Code33 {
	public static void main(String[] args) {
		int[] data1 = {4, 2, 9, 10, 1};
		for (int x : data1) {
			System.out.println(x);
		}
		
		
		double[] data2 = {90.5, 88.3, 70.8, 67.2, 92.4, 80.7};
		double total = 0.0;
		double average;
		
		for (double y : data2) {
			total += y;
		}
		average = total / data2.length;
		System.out.println("average: " + average);
		
		
		char[] alpha = {'A', 'B', 'C', 'D', 'E'};
		for (char z : alpha) {
			System.out.println(z + ":" + (char)(z+32));
		}
		
		
		int numbers[][] = {{10, 30, 20, 15},
						   {11, 5, 2, 9},
						   {7, 8, 1, 13}};
		
		for (int[] num : numbers) {
			for (int n : num) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
