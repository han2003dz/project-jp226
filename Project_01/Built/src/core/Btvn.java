package core;

import java.util.Scanner;

public class Btvn {
	/**
	 * <i>Cập nhật ngày: 26/03/2023</i>
	 * 
	 * @author HanNguyen
	 * 
	 */
	
	/**
	 * 
	 * @param a - số thứ 1
	 * @param b - số thứ 2
	 * @return UCLN(a, b)
	 */
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		return GCD(b, a%b);
	}
	/**
	 * 
	 * @param a - số thứ 1
	 * @param b - số thứ 2
	 * @return BCNN(a, b)
	 */
	public static int LCM(int a, int b) {
		return a*b/GCD(a, b);
	}
	
	/**
	 * 
	 * @param n - giá trị cần kiểm tra
	 * @return kết quả trả về là true nếu là <b>số lập phương</b> or ngược lại
	 */
	public static boolean isPerfectCube(int n) {
	    for (int i = 1; i <= n; i++) {
	        if (i * i * i == n) {
	            return true;
	        }
	    }
	    return false;
	}
	/*đệ quy*/
//	public static int fibonacii(int n) {
//		if(n <= 1) return n;
//		return fibonacii(n-1) + fibonacii(n-2);
//	}
	public static int fibonacci(int n) {
	    if (n <= 1) {
	        return n;
	    } else {
	        int fib = 1;
	        int prevFib = 1;
	        
	        for (int i = 2; i < n; i++) {
	            int temp = fib;
	            fib += prevFib;
	            prevFib = temp;
	        }
	        
	        return fib;
	    }
	}
	public static void towerOfHanoi(int n, char start_rod, char to_rod, char end_rod) {
        if (n == 1) {
            System.out.println("Chuyển 1 đĩa từ cột " +  start_rod + " sang " + to_rod);
            return;
        }
        towerOfHanoi(n-1, start_rod, end_rod, to_rod);
        System.out.println("di chuyển đĩa " + n + " từ cột " +  start_rod + " sang cột " + to_rod);
        towerOfHanoi(n-1, end_rod, to_rod, start_rod);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(Btvn.isPerfectCube(n)) {
			System.out.print("true");
		}else {
			System.out.print("false");
		}
		System.out.println();
		towerOfHanoi(3, 'A','B', 'C');
	}
}
