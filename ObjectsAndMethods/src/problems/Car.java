package problems;

public class Car {
	private int yearModel = 0;
	private String make = "";
	private int speed = 0;
	
	public Car(int yearModel, String make) {
		this.make = make;
		this.yearModel = yearModel;
	}
	
	public void accelerate() {
		speed += 5;
	}
	
	public void brake() {
		speed -= 5;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	
	public String getMake() {
		return make;
	}
	public int getSpeed() {
		return speed;
	}
	public int getYearModel() {
		return yearModel;
	}
	
}
