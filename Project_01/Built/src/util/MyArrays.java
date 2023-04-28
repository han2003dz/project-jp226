package util;
import java.util.*;
import core.*;
public class MyArrays {
	/**
	 * Phương thức sinh ngẫu nhiên n phần tử mảng 1 chiều có giá trị từ 0 - 100
	 * 
	 * @param n
	 * @return
	 */
	public static int[] generateArray(int n) {
		int[] arrInt = new int[n];
		for(int i = 0; i < arrInt.length; i++) {
			arrInt[i] = (int) (Math.random()*100);
		}
		return arrInt;
	}
	/**
	 * chuyển mảng nguyên thủy sang đối tượng
	 * @param arrInt
	 * @return
	 */
	public static Integer[] convertArray(int[] arrInt) {
		Integer[] tmp = new Integer[arrInt.length];
		Arrays.setAll(tmp, i -> arrInt[i]);
		return tmp;
	}
	public static Integer[][] generateArray(int rows, int cols){
		Integer[][] arrInt = new Integer[rows][cols];
		for(int i = 0; i<rows; i++) {
			arrInt[i] = MyArrays.convertArray(MyArrays.generateArray(cols));
		}
		return arrInt;
	}
	public static Person[] generatePerson(int n) {
		Person[] list = new Person[n];
		String firstNames = "Anh Ánh Bình Bá Cường Châu Dương Dậu Huyền Hùng Hương Linh Minh Thủy Dũng Vũ Hải Tuấn Khang Trọng Yến Trang Ngọc";
		String lastNames = "Hoàng Lê Nguyễn Bùi Trần Đào Phạm Đoàn Phan Dương Ngô Vũ Lương Đinh Từ Ninh";
		
		int index;
		byte nb;
		String[] tmp = firstNames.split(" ");
		String[] tmp2 = lastNames.split(" ");
		for(int i = 0; i < n; i++) {
			// cấp phát bộ nhớ cho phần tử mảng
			String tmp_value = "";
			list[i] = new Person();
			// sinh ngẫu nhiên tên
			nb = (byte)(Math.random()*2);
			for(int j = 0; j <= nb; j++) {
				index = (int)(Math.random()*tmp.length);
				while(tmp[index].equalsIgnoreCase(" ")) {
					index = (int)(Math.random()*tmp.length);
				}
				tmp_value += tmp[index];
				if(j != nb) {
					tmp_value += " ";
				}
			}
			list[i].setFirstName(tmp_value);
			// sinh ngẫu nhiên họ
			index = (int) (Math.random()*tmp2.length);
			while(tmp2[index].equalsIgnoreCase(" ")) {
				index = (int) (Math.random()*tmp2.length);
			}
			tmp_value += tmp2[index];
			list[i].setLastName(tmp2[index]);
			// sinh ngẫu nhiên tuổi 
			byte age = (byte) (18 + (int)(Math.random()*20));
			list[i].setAge(age);
		}
		return list;
		
	
	}
	public static Person[] searchPerson(Person[] list, String name) {
		Person[] result = null;
		int count = 0;
		for(Person p : list) {
			if(p.getFirstName().contains(name)) {
				count++;
			}
		}
		
		// khởi tao mảng kết quả
		result = new Person[count];
		// ghi nhận kết quả
		count = 0;
		for(Person p : list) {
			if(p.getFirstName().contains(name)) {
				result[count++] = p;
			}
		}
		return result;
	}
	public static ArrayList<Person> searchPersonV2(Person[] list, String name){
		ArrayList<Person> result = new ArrayList<>();
		for(Person p : list) {
			if(p.getFirstName().contains(name)) result.add(p);
		}
		return result;
	}
	public static void printArray(Integer[][] arrInt) {
		// java 5
		for(Integer[] row: arrInt) {
			MyArrays.printArray(row);
		}
		// sư dụng tập hợp
		System.out.print(Arrays.deepToString(arrInt));
	}
	public static Integer[][] sortedArray(Integer[][] arrInt, boolean isINC){
		// lấy kích thước 
		if(arrInt == null) {
			return null;
		}
		int rows = arrInt.length;
		int cols = arrInt[0].length;
		Integer[] tmp = new Integer[rows * cols];
		int r = 0, c = 0;
		for(int  i = 0; i < tmp.length; i++) {
			tmp[i] = arrInt[r][c++];
			if(c == cols) {
				r++;
				c = 0;
			}
		}
		if(isINC) {
			Arrays.sort(tmp);
		}else {
			Arrays.sort(tmp, Collections.reverseOrder());
		}
		// chuyển về mảng ban đầu
		r =0; 
		c = 0;
		for(int i = 0; i < tmp.length; i++) {
			arrInt[r][c++] = tmp[i];
			if(c == cols) {
				r++;
				c=0;
			}
		}
		return arrInt;
		
	}
	public static int[] shortedArray(int[] arrInt, boolean isINC) {
		byte ori = (byte) (isINC ? 1 : -1);
		int tmp;
		for(int i = 0; i < arrInt.length - 1; i++) {
			for(int j = i + 1; j < arrInt.length; j++) {
				if(arrInt[i] > arrInt[j]) { // đổi chiều thì * i với ori và j với ori
					tmp = arrInt[i];
					arrInt[i] = arrInt[j];
					arrInt[j] = tmp;
				}
				
			}
		}
		return arrInt;
	}
	/**
	 * sắp xếp theo tập hợp
	 * @param arrInt
	 * @param isINC
	 * @return
	 */
	public static Integer[] sortedArrayV2(int[] arrInt, boolean isINC) {
		// chuyển đổi sang mảng đối tượng
		Integer[] tmp = MyArrays.convertArray(arrInt);
		if(isINC) {
			Arrays.sort(tmp);
		}else {
			Arrays.sort(tmp, Collections.reverseOrder());
		}
		return tmp;
	}
	// phương thức kiểm tra số nguyên tố
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
	public static Integer[] filterArray(int[] arrInt, boolean isINC) {
		// sắp xêp
		Integer[] tmp = MyArrays.sortedArrayV2(arrInt, isINC);
		// tách nguyên tố
		Integer[] temp1 = new Integer[tmp.length];
		Integer[] temp2 = new Integer[tmp.length];
		int t1=0, t2=0;
		for(int v: tmp) {
			if(MyArrays.isPrime(v)) {
				temp1[t1++] = v;
			}else {
				temp2[t2++] = v;
			}
		}
		// ghép 2 mảng lại với nhau - mảng nguyên tố lên đầu
		for(int i = t1; i < temp1.length; i++) {
			temp1[t1] = temp2[i - t1];
		}
		return temp1;
	}
	public static void printArray(int[] arrInt) {
		//cách 1 theo C/C++
//		for(int i = 0; i < arrInt.length; i++) {
//			System.out.print(arrInt[i] + " ");
//		}
		// cách 2 : java 5
//		for(int v: arrInt) {
//			System.out.print(v + " ");
//		}
		// cách 3: sử dụng Arrays
		System.out.print(Arrays.toString(arrInt));
		System.out.println();
	}
	public static void printArray(Integer[] arrInt) {
		System.out.print(Arrays.toString(arrInt));
	}
	public static void printPerson(Person[] list) {
		for(Person p : list) {
			System.out.println(p);
		}
	}
	public static void printPerson(ArrayList<Person> list) {
		list.forEach(p -> System.out.println(p));
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//int[] arrInt = MyArrays.generateArray(20);
//		Integer[][] arrInt = MyArrays.generateArray(30, 30);
//		MyArrays.printArray(arrInt);
//		System.out.print("-----------\n");
//		arrInt = MyArrays.sortedArray(arrInt, true);
//		MyArrays.printArray(arrInt);
		
		// sắp xếp 
//		Integer[] results = MyArrays.sortedArrayV2(arrInt, true);
//		MyArrays.printArray(results);
//		MyArrays.printArray(MyArrays.filterArray(arrInt, true));
		Person[] list = MyArrays.generatePerson(30);
		MyArrays.printPerson(list);
		System.out.print("------------\n");
		Person[] result = MyArrays.searchPerson(list, "Anh");
//		MyArrays.printPerson(result);
		MyArrays.printPerson(result);
		System.out.print("-----------------\n");
		ArrayList<Person> result2 = MyArrays.searchPersonV2(list, "Anh");
		MyArrays.printPerson(result2);
	}
}
//sinh ngẫu nhiên mảng 2 chiều và 3 chiều 
//sắp xếp theo thứ tự nào đó cho các mảng đó
// 
