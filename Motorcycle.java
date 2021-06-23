public class Motorcycle extends Vehicle {
	String type, model;

	public Motorcycle(String engineType, String color, String make, String type, String model) {
		super(engineType, color, make, 2);
		this.type = type;
		this.model = model;
	}
}
