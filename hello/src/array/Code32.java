package array;

public class Code32 {
	public static void main(String[] args) {
		int[][] data1 = {{3, 1, 7, 8},
				{9, 2, 2, 5},
				{1, 3, 5, 7}};
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(data1[i][j] + " ");
			}
			System.out.println();
		}
		
		int data2[][] = new int[3][];
		data2[0] = new int[4];
		data2[1] = new int[5];
		data2[2] = new int[3];
		
		for (int i=0; i<data2.length; i++) {
			for (int j=0; j<data2[i].length; j++) {
				System.out.print(data2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
