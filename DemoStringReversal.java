
class StringReversal {
	
	String name;
	StringReversal(String a) {
		this.name = a;
	}
	
	public void ReverseString() {
		String a = this.name;
		String b="";
		for(int i=a.length()-1; i>=0;i--) {
			b +=a.charAt(i);
		}
		System.out.println(b);
		System.out.println(b.toUpperCase());
		if(a.equals(b)) {
			System.out.println("String is Pelindrome");
		}
		else {
			System.out.println("String is not Pelindrome");
		}
	}
	
	public void Division(int a) {
		try {
			int b = 90;
			int result = b/a;
			System.out.println(a);
			
		} catch(ArithmeticException e) {
			System.out.println("Divide By zer");
		}
	}
}

class DemoStringReversal {
	public static void main(String args[]) {
		StringReversal sr = new StringReversal(args[0]);
		sr.ReverseString();
		sr.Division(0);
	}
}
