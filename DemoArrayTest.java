import java.io.Console;
class ArrayTest {
	
	public void UseArray() {
		int aArray[];
		Console console = System.console();
		int a = Integer.parseInt(console.readLine("How many elements you want to put in array ? "));
		aArray = new int[a];
		for(int i=0; i<=a-1; i++ ) {
			aArray[i] = i+1;
		}
		
		for(int i=0;i<=a-1;i++)  {
			try {
				Thread.sleep(400);
				System.out.println(aArray[i]);
			}
			catch (InterruptedException e) {
				System.out.println("Got it");
			}
		}
	}
	
	public void finalize() {
		System.out.println("Holy Fucking Shit!!");
	}
	
}

public class DemoArrayTest {
	
	public static void main(String[] args) {
		ArrayTest at = new ArrayTest();
		at.UseArray();
		at = null;
	}
}
