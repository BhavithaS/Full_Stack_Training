
interface A{
	void run();
}

class B implements A{
	public void run(){
	System.out.println("Hello there!");
	}
	public static void main(String[] a){
	B ab = new B();
	ab.run();
	}
}
