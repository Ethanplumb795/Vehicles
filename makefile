all: Vehicle

Vehicle: Vehicle.java
	javac Car.java Driver.java Motorcycle.java Sedan.java SUV.java Truck.java Vehicle.java

clean:
	rm -rf *.class
