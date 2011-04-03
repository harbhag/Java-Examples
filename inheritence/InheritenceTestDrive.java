class InheritenceSuperclass {
	
	public int a;
	public int b;
	
	public int operation(int x, int y) {
		
		int result = x + y;
		return result;
	}
}

class InheritenceSubclassOne extends InheritenceSuperclass {
}

class InheritenceSubclassTwo extends InheritenceSuperclass {
	
	public int operation(int x, int y) {
		int intermediate = super.operation(x, y);
		
		int result = intermediate * x * y;
		return result;
	}
}

class InheritenceTestDrive {
	
	public static void main(String[] args) {
		
		InheritenceSubclassOne one = new InheritenceSubclassOne();
		one.a = 2;
		one.b = 3;
		
		int result = one.operation(one.a, one.b);
		
		System.out.println("The Result is " + result);
		
		InheritenceSubclassTwo two = new InheritenceSubclassTwo();
		two.a = 2;
		two.b = 3;
		
		int resulttwo = two.operation(two.a, two.b);
		System.out.println("The Result of Two is " + resulttwo);
	}
}

