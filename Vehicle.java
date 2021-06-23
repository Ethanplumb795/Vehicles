public class Vehicle {
	protected String engineType, color, make;
	protected int numWheels;

	public Vehicle(String engineType, String color, String make, int numWheels) {
		this.engineType = engineType;
		this.color = color;
		this.make = make;
		this.numWheels = numWheels;
	}

	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}

	public int getNumWheels() {
		return numWheels;
	}
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
}
