class SwitchTest {
	
	public void SwitchIndex(int marks) {
		int index = 100/marks;
		
		switch(index) {
			case 10:
			System.out.println("Honoured");
			break;
			case 5:
			System.out.println("Average");
			break;
			case 2:
			System.out.println("Poor");
			break;
			default:
			System.out.println("Fail");
			break;
		}
	}
}

class DemoSwitch {
	public static void main(String[] args) {
		SwitchTest st = new SwitchTest();
		st.SwitchIndex(Integer.parseInt(args[0]));
	}
}
