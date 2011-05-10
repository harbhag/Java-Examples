class Recursion {
	
	public int Factorial(int a) {
		if(a==1) {
			return 1;
		}
		else {
			int result = Factorial(a-1)*a;
			System.out.println(a);
			System.out.println(result);
			return result;
		}
	}
}

public class DemoRecursion {
	public static void main(String[] args) {
		Recursion rec = new Recursion();
		System.out.println("Factorial of 5 is = "+rec.Factorial(5));
	}
}
