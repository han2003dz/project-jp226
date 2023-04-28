package util;
import java.util.*;
public class RandomArr2 {
	public static int[][] generateArr2(int row, int col) {
		int[][] arrInt = new int[row][col];
		Random rand = new Random();
		for (int i = 0; i < row; i++) {
			for(int j = 0; j< col; j++) {
				arrInt[i][j] = rand.nextInt(9);
			}
		}
		return arrInt;
	}
	public static void printArr2(int[][] arrInt) {
		for(int i = 0; i < arrInt.length; i++) {
			for(int j = 0; j < arrInt[i].length; j++) {
				System.out.print(arrInt[i][j] + " ");
			}
			System.out.println();
		}
	}
	//other method
	public static void main(String[] args) {
		int[][] arrInt = RandomArr2.generateArr2(4, 3);
		RandomArr2.printArr2(arrInt);
	}
}


