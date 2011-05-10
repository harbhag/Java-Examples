class ThreadTest implements Runnable {
	Thread t;
	
	ThreadTest(String name) {
		t = new Thread(this,name);
		t.start();
	}
	
	public void run() {
		try {
			for(int i=0; i<=5;i++) {
				Thread.sleep(4000);
				System.out.println(name);
			}
		}	catch(InterruptedException e) {
			System.out.println("interrupt");
		}
	}
}

class DemoThreadTest {
	public static void main(String args[]) {
		new ThreadTest("one");
		new ThreadTest("Two");
		new ThreadTest("three");
	}
}
