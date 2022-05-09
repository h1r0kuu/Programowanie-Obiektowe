package cw6;

public class Cw6 {
	public static void main(String[] args) {
		int size = 5;
		int[][] arr = new int[size][size];
		int dir = 0;
		int col = 0;
		int rows = 0;
		for(int i = 0; i < size * size; i++) {		
			if(dir % 2 == 0) {
				arr[col][rows] = i + 1;
				col++;
				if(col == 5) {
					dir++;
					rows++;
					col = size - 1;
				}
			} else {
				arr[col][rows] = i + 1;
				col--;
				if(col == -1) {
					dir++;
					rows++;
					col = 0;
				}
			}
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print( arr[i][j] + " ");
			}
			System.out.print('\n');
		}
	}
}
