package util;
import java.util.*;
public class RandomArr3 {
	public static int[][][] generateArr3(int m, int n, int q){
		int[][][] arrInt = new int[m][n][q];
		Random rand = new Random();
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				for(int k = 0; k<q; k++) {
					arrInt[i][j][k] = rand.nextInt(100);
				}
			}
		}
		return arrInt;
	}
	public static void printArr3(int arrInt[][][]) {
		for(int i = 0; i<arrInt.length; i++) {
			for(int j = 0; j<arrInt[i].length; j++) {
				for(int k = 0; k<arrInt[i][j].length; k++) {
					System.out.print( arrInt[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][][] arrInt = RandomArr3.generateArr3(3, 3, 2);
		RandomArr3.printArr3(arrInt);
	}
}
