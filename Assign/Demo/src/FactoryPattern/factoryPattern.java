package FactoryPattern;

public class factoryPattern {

	public static void main(String[] args) {
		// as only an object is returned from Car class method it is factory
		Car obj = Car.display();
		
	}

}

class Car{
	
//	Car obj = new Car();
	
	private Car() {
		System.out.println("Car object created");
	}
	
	public static Car display() {
		return new Car();
	}
}
