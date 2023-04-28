package core;

public class Person {
	//constants
	public static final String FIRSTNAME = "No FirstName";
	public static final String LASTNAME = "No LastName";
	public static final byte AGE = 0;
	public static final Address ADDRESS = new Address();
//	Class variables
	private static int count = 0;
//	Object's properties
	private String firstName; // che dấu tuyệt đối
	private String lastName;
	private byte age; // che dấu nhưng các đối tượng con vẫn có thể kiểm tra -protected
	private Address address;
//	constructor methods - phương thức khởi tạo đối tượng và gán giá trị ban đầu cho các thuộc tính
	public Person() {
//		firstName = "No FirstName";
//		lastName = "No LastName";
//		age = 0;
		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE, Person.ADDRESS);
	}
	public Person(byte age) {
		this(Person.FIRSTNAME, Person.LASTNAME, age, Person.ADDRESS);
	}
	public Person(String firstName, byte age) {
		this(firstName, Person.LASTNAME, age, Person.ADDRESS);
	}
	public Person(String firstName, String lastName, byte age, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		// Tăng biến đếm đối tượng tạo ra trong bộ nhớ
		Person.count++;
		// cach 1 gán địa chỉ trong bộ nhớ cho nhau
//		this.address = address;
		// cách 2 khởi tạo bộ nhớ mới và sao chép giá trị
		this.address = new Address(address);
	}
	public Person(Person p) {
		this(p.getFirstName(), p.getLastName(), p.getAge(), p.getAddress());
	}
//	Getter methods
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public byte getAge() {
		return this.age;
	}
	public Address getAddress() {
		return this.address;
	}
//	Setter method
	public Person setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public Person setAge(byte age) {
		this.age = age;
		return this;
	}
	public Person setAddress(Address address) {
		this.address = address;
		return this;
	}
	public Person setAddress(String cityName, String districtName, String streetName) {
		this.address = new Address(cityName, districtName, streetName);
		return this;
	}
//	Other method
	
	public String toString() {
		return this.lastName + " " + this.firstName + " " + this.age;
//		return this.lastName + " " + this.firstName + " " + this.age + " "  + this.address.toString();
	}
	public static int getCountPerson() {
		return Person.count;
	}
	// phương thức dọn dẹp lớp đối tượng
	protected void finalize() throws Throwable{
		// giảm số biến đêm 
		Person.count--;
	}
	public static void main(String[] args) {
//		khởi tạo các thể hiện của lớp đối tượng
		Address addr = new Address("Hong minh", "Hung Ha", "Thai Binh");
		Person p;
		Person p1 = new Person();
		Person p2 = new Person((byte)20);
		Person p3 = new Person("Hân", (byte)20);
		Person p4 = new Person("Hân", "Nguyễn", (byte)20, addr);
		Person p5 = new Person(p1);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
//		bổ sung thông tin cho p1
		p1.setFirstName("Thảo").setLastName("Lê Phương").setAge((byte)20);
		System.out.println(p1);
		System.out.println(Person.getCountPerson());
	}
	
}
