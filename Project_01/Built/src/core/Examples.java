package core;

public class Examples {
	/**
	 * Phương thức kiểm tra một giá trị có phải nguyên tố? <br>
	 * <i>Cập nhật ngày: 24/03/2023</i>
	 * 
	 * @author HanNguyen
	 * @param n - giá trị cần kiểm tra
	 * @return kết quả trả về là true - nếu <b>nguyên tố or ngược lại </b>
	 */
//	kiểm tra n là 1 số nguyên tố hay không
	public static boolean isPrime(int n) {
		boolean flag = true;
		if(n < 2) {
			flag = false;
		}else {
			for(int i = 2; i <= (int)(Math.sqrt(n)); i++) {
				if(n % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	public static double getTriangle(int a, int b, int c) {
		double p = (a + b + c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
	}
	public static int getGCD(int a, int b) {
		if(b == 0) return a;
		return getGCD(b, a % b);
	}
//	nạp chồng phương thức
	public static int getGCD(int a, int b, int c) {
		return Examples.getGCD(Examples.getGCD(a, b), c);
	}
	public static int getLCM(int a, int b) {
		return a*b/Examples.getGCD(a, b);
	}
	public static void main(String[] args) {
//		sinh ngẫu nhiên giá trị nguyên (int) n
		int n = (int)(Math.random()*100);
		System.out.println("giá trị ngẫu nhiên của n là: " + n);
//		khởi tạo thể hiện của lớp đối tượng
//		Examples ex = new Examples(); -> tốn bộ nhớ 
		if(Examples.isPrime(n)) {
			System.out.print("n là số nguyên tố");
		}else {
			System.out.print("không là số nguyên tố");
		}
		System.out.println(Examples.getTriangle(2, 3, 2));
	}
}
