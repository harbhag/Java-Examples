class Overloading {
	
	public void Dog(int age, String name) {
		System.out.println("My Dog's Name is "+name+" \nMy Dog is "+age+" Years old.");
	}
	
	public void Dog(String name) {
		System.out.println("--------------------------\nMy Dog's Name is "+name+"\nI dont know my Dog's age, SOrry.");
	}
}

public class DemoOverloading {
	
	public static void main(String[] args) {
		Overloading ovl = new Overloading();
		ovl.Dog(5,"Tommy");
		ovl.Dog("Jack");
	}
}
