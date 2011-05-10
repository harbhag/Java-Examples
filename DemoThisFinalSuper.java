class ThisFinalSuper {
	String Intro = "Hello, I am ThisFinalSuper Object";
	
	public void SuperThisDemo() {
	}
	
	final void FinalMethod() {
		System.out.println("I am Final Method, Dont You Dare to Override me, huh!");
	}
}

class Subclass extends ThisFinalSuper {
	String Intro = "Hello, I am Subclass Object";
	public void SuperThisDemo() {
		System.out.println("Intro of Subclass: "+this.Intro);
		System.out.println("Intro of ThisFinalSuper: "+super.Intro);
	}
}

class DemoThisFinalSuper {
	public static void main(String[] args) {
		Subclass sc = new Subclass();
		sc.SuperThisDemo();
		sc.FinalMethod();
	}
}
