package core;

public class Car {
	// constants
	public static final double CAR_LENGTH = 0;
	public static final double CAR_HEIGHT = 0;
	
	// object's properties
	private double carLength, carHeight, carWidth;
	private String typeOfEngine,engineDisplacement, horsepower, topspeed;
	private String typeOfTransmission, numberOfGears, shiftPattern;
	private String absorbsShocks, springs;
	private String brakes;
	private String steering;
	private String audioSystem, seats, airConditioning, gpsNavigation, entertainmentSystem, airbags, antiTheftSystem;
	// constructor method
	public Car() {
		
	}
	public Car(double carLength, double carHeight, double carWidth, String typeOfEngine, String engineDisplacement,
			String horsepower, String topspeed, String typeOfTransmission, String numberOfGears, String shiftPattern,
			String absorbsShocks, String springs, String brakes, String steering, String audioSystem, String seats,
			String airConditioning, String gpsNavigation, String entertainmentSystem, String airbags,
			String antiTheftSystem) {
		this.carLength = carLength;
		this.carHeight = carHeight;
		this.carWidth = carWidth;
		this.typeOfEngine = typeOfEngine;
		this.engineDisplacement = engineDisplacement;
		this.horsepower = horsepower;
		this.topspeed = topspeed;
		this.typeOfTransmission = typeOfTransmission;
		this.numberOfGears = numberOfGears;
		this.shiftPattern = shiftPattern;
		this.absorbsShocks = absorbsShocks;
		this.springs = springs;
		this.brakes = brakes;
		this.steering = steering;
		this.audioSystem = audioSystem;
		this.seats = seats;
		this.airConditioning = airConditioning;
		this.gpsNavigation = gpsNavigation;
		this.entertainmentSystem = entertainmentSystem;
		this.airbags = airbags;
		this.antiTheftSystem = antiTheftSystem;
	}
	// getter and setter 
	public double getCarLength() {
		return carLength;
	}
	public void setCarLength(double carLength) {
		this.carLength = carLength;
	}
	public double getCarHeight() {
		return carHeight;
	}
	public void setCarHeight(double carHeight) {
		this.carHeight = carHeight;
	}
	public double getCarWidth() {
		return carWidth;
	}
	public void setCarWidth(double carWidth) {
		this.carWidth = carWidth;
	}
	public String getTypeOfEngine() {
		return typeOfEngine;
	}
	public void setTypeOfEngine(String typeOfEngine) {
		this.typeOfEngine = typeOfEngine;
	}
	public String getEngineDisplacement() {
		return engineDisplacement;
	}
	public void setEngineDisplacement(String engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	public String getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}
	public String getTopspeed() {
		return topspeed;
	}
	public void setTopspeed(String topspeed) {
		this.topspeed = topspeed;
	}
	public String getTypeOfTransmission() {
		return typeOfTransmission;
	}
	public void setTypeOfTransmission(String typeOfTransmission) {
		this.typeOfTransmission = typeOfTransmission;
	}
	public String getNumberOfGears() {
		return numberOfGears;
	}
	public void setNumberOfGears(String numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
	public String getShiftPattern() {
		return shiftPattern;
	}
	public void setShiftPattern(String shiftPattern) {
		this.shiftPattern = shiftPattern;
	}
	public String getAbsorbsShocks() {
		return absorbsShocks;
	}
	public void setAbsorbsShocks(String absorbsShocks) {
		this.absorbsShocks = absorbsShocks;
	}
	public String getSprings() {
		return springs;
	}
	public void setSprings(String springs) {
		this.springs = springs;
	}
	public String getBrakes() {
		return brakes;
	}
	public void setBrakes(String brakes) {
		this.brakes = brakes;
	}
	public String getSteering() {
		return steering;
	}
	public void setSteering(String steering) {
		this.steering = steering;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getAirConditioning() {
		return airConditioning;
	}
	public void setAirConditioning(String airConditioning) {
		this.airConditioning = airConditioning;
	}
	public String getGpsNavigation() {
		return gpsNavigation;
	}
	public void setGpsNavigation(String gpsNavigation) {
		this.gpsNavigation = gpsNavigation;
	}
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}
	public void setEntertainmentSystem(String entertainmentSystem) {
		this.entertainmentSystem = entertainmentSystem;
	}
	public String getAirbags() {
		return airbags;
	}
	public void setAirbags(String airbags) {
		this.airbags = airbags;
	}
	public String getAntiTheftSystem() {
		return antiTheftSystem;
	}
	public void setAntiTheftSystem(String antiTheftSystem) {
		this.antiTheftSystem = antiTheftSystem;
	}
	// other method
	@Override
	public String toString() {
		return "Car [carLength=" + carLength + ", carHeight=" + carHeight + ", carWidth=" + carWidth + ", typeOfEngine="
				+ typeOfEngine + ", engineDisplacement=" + engineDisplacement + ", horsepower=" + horsepower
				+ ", topspeed=" + topspeed + ", typeOfTransmission=" + typeOfTransmission + ", numberOfGears="
				+ numberOfGears + ", shiftPattern=" + shiftPattern + ", absorbsShocks=" + absorbsShocks + ", springs="
				+ springs + ", brakes=" + brakes + ", steering=" + steering + ", audioSystem=" + audioSystem
				+ ", seats=" + seats + ", airConditioning=" + airConditioning + ", gpsNavigation=" + gpsNavigation
				+ ", entertainmentSystem=" + entertainmentSystem + ", airbags=" + airbags + ", antiTheftSystem="
				+ antiTheftSystem + "]";
	}
	public static void main(String[] args) {
		
	}
}
