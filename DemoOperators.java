import java.io.Console;
class Operators {
	
	public void TestingOperators() {
		Console console = System.console();
		int a = Integer.parseInt(console.readLine("Enter First Number a = "));
		int b = Integer.parseInt(console.readLine("Enter First Number b = "));
		
		System.out.println("Arithmetic operators \n----------------------------");
		System.out.println("a+b = "+(a+b));
	}
}

class DemoOperators {
	
	public static void main(String[] args) {
		Operators op = new Operators();
		
		op.TestingOperators();
	}
}
