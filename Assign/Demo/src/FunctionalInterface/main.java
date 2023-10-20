package FunctionalInterface;


interface A{
	void run();
}

public class main implements A {
	public void run() {
		System.out.println("Hello there");
	}

	public static void main(String[] args) {
		main obj = new main();
		obj.run();
		
	}

}