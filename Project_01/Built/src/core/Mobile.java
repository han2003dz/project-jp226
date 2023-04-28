package core;

public class Mobile {
	/**
	 * <i>Cập nhật ngày: 30/03/2023</i>
	 * @author Hân Nguyễn
	 * @param screenTechnology - công nghệ màn hình
	 * @param
	 */
	//constants 
	public static final String SCREEN_TECHNOLOGY = "No screen technology";
	public static final String OPERATING_SYTEM = "No operating system";
	public static final String PROCESSOR = "No processor";
	public static final String INTERNAL_MEMORY = "No internal memory";
	public static final int RAM = 0;
	public static final String BATTERY = "No battery";
	public static final String CAMERA = "No camera";
	public static final String AUDIO = "No audio";
	public static final String MATERIAL = "No material";
	public static final double PRICE = 0;
	
	//object's properties
	private String screenTechnology;
	private String operatingSytem;
	private String processor;
	private String internalMemory;
	private int ram;
	private String battery;
	private String camera;
	private String audio;
	private String material;
	private double price;
	//constructor method 
	public Mobile() {
		this(Mobile.SCREEN_TECHNOLOGY, Mobile.OPERATING_SYTEM, Mobile.PROCESSOR, Mobile.INTERNAL_MEMORY, Mobile.RAM, Mobile.BATTERY, Mobile.CAMERA, Mobile.AUDIO
				,Mobile.MATERIAL, Mobile.PRICE);
	}
	public Mobile(String screenTechnology, String operatingSytem, String processor, String internalMemory, int ram,
			String battery, String camera, String audio, String material, double price) {
		this.screenTechnology = screenTechnology;
		this.operatingSytem = operatingSytem;
		this.processor = processor;
		this.internalMemory = internalMemory;
		this.ram = ram;
		this.battery = battery;
		this.camera = camera;
		this.audio = audio;
		this.material = material;
		this.price = price;
	}
	// getter and setter
	public String getScreenTechnology() {
		return screenTechnology;
	}
	public void setScreenTechnology(String screenTechnology) {
		this.screenTechnology = screenTechnology;
	}
	public String getOperatingSytem() {
		return operatingSytem;
	}
	public void setOperatingSytem(String operatingSytem) {
		this.operatingSytem = operatingSytem;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getInternalMemory() {
		return internalMemory;
	}
	public void setInternalMemory(String internalMemory) {
		this.internalMemory = internalMemory;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getAudio() {
		return audio;
	}
	public void setAudio(String audio) {
		this.audio = audio;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	// other method
	@Override
	public String toString() {
		return "Mobile [screenTechnology=" + screenTechnology + ", operatingSytem=" + operatingSytem + ", processor="
				+ processor + ", internalMemory=" + internalMemory + ", ram=" + ram + ", battery=" + battery
				+ ", camera=" + camera + ", audio=" + audio + ", material=" + material + ", price=" + price + "]";
	}
	public static void main(String[] args) {
		Mobile m;
		Mobile m1 = new Mobile();
	}
	
}
