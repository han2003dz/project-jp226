package core;

import java.util.List;

public class Address {
	// constants - 1
	public static final String CITYNAME = "No cityName";
	public static final String DISTRICTNAME = "No districtName";
	public static final String STREETNAME = "No treetName";
	
	//Object properties
	private String cityName;
	private String districtName;
	private String streetName;
	//private List<Address> addrs;
	// constructor methods -2
	public Address() {
		this(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);
	}
	public Address(String cityName, String districtName, String streetName) {
		// TODO Auto-generated constructor stub
		this.cityName = cityName;
		this.districtName = districtName;
		this.streetName = streetName;
	}
	public Address(Address addr) {
		this(addr.getCityName(), addr.getDistrictName(), addr.getStreetName());
	}
		
	//getter -3
	public String getCityName() {
		return this.cityName;
	}
	public String getDistrictName() {
		return this.districtName;
	}
	public String getStreetName() {
		return this.streetName;
	}
	//setter -4
	public Address setCityName(String cityName) {
		this.cityName = cityName;
		return this;
	}
	public Address setDistrictName(String districtName) {
		this.districtName = districtName;
		return this;
	}
	public Address setStreetName(String streetName) {
		this.streetName = streetName;
		return this;
	}
	//other method - 5
	public String toString() {
		return this.cityName + " " + this.districtName + " " + this.streetName;
	}
	public static void main(String[] args) {
		
		//Address a;
		//Address a1 = new Address();
		//Address a2 = new Address("Lê", "Thảo","20");
		
	}
}
