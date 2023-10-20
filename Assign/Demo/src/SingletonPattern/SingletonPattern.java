package SingletonPattern;

//import FactoryPattern.Car;

public class SingletonPattern {

	public static void main(String[] args) {
		Car car = Car.display();
		
	}

}

class Car{
	// static as this obj is returned to A STATIC MAIN METHOD
	static Car obj = new Car();
	
	private Car() {
		System.out.println("Car object created");
	}
	
	public static Car display() {
		// singleton as only one object/ this single object is returned
		// not a new object like factory
		return obj;
	}
}

