package core;

public class Laptop {
	// constants
	public static final String COMPUTER_SCREEN = "No computer screen";
	public static final String COMPUTER_PROCESSOR = "No computer processor";
	public static final int RAM = 0;
	public static final String HARD_DRIVE = "No hard drive";
	public static final String GRAPHICS_CARD = "No graphics card";
	public static final String BATTERY = "No battery";
	public static final String PORTS = "No ports";
	public static final double WEIGHT = 0;
	// object properties 
	private String computerScreen;
	private String computerProcessor;
	private int ram;
	private String hardDrive;
	private String graphicsCard;
	private String battery;
	private String ports;
	private double weight; 
	// constructor methods
	public Laptop() {
		this(Laptop.COMPUTER_SCREEN, Laptop.COMPUTER_PROCESSOR, Laptop.RAM, Laptop.HARD_DRIVE, Laptop.GRAPHICS_CARD, Laptop.BATTERY, 
				Laptop.PORTS, Laptop.WEIGHT);
	}
	public Laptop(String computerScreen, String computerProcessor, int ram, String hardDrive, String graphicsCard,
			String battery, String ports, double weight) {
		this.computerScreen = computerScreen;
		this.computerProcessor = computerProcessor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.battery = battery;
		this.ports = ports;
		this.weight = weight;
	}
	// getter and setter
	
	
	
	public String getComputerScreen() {
		return computerScreen;
	}
	public void setComputerScreen(String computerScreen) {
		this.computerScreen = computerScreen;
	}
	public String getComputerProcessor() {
		return computerProcessor;
	}
	public void setComputerProcessor(String computerProcessor) {
		this.computerProcessor = computerProcessor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getHardDrive() {
		return hardDrive;
	}
	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}
	public String getGraphicsCard() {
		return graphicsCard;
	}
	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getPorts() {
		return ports;
	}
	public void setPorts(String ports) {
		this.ports = ports;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	// Other method
	
	@Override
	public String toString() {
		return "Laptop [computerScreen=" + computerScreen + ", computerProcessor=" + computerProcessor + ", ram=" + ram
				+ ", hardDrive=" + hardDrive + ", graphicsCard=" + graphicsCard + ", battery=" + battery + ", ports="
				+ ports + ", weight=" + weight + "]";
	}
	public static void main(String[] args) {
		
	}
	
}
