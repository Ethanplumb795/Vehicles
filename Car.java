public class Car extends Vehicle {
	String model;
	protected int seatingCapacity;

	public Car(String engineType, String color, String make, int numWheels, String model, int seatingCapacity) {
		super(engineType, color, make, numWheels);
		this.model = model;
		this.seatingCapacity = seatingCapacity;
	}
}
