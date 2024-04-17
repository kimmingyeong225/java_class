package basic.ch09;

public class Student2 {
	/*
	 * Bus bus1 = new Bus(100); Bus bus2 = new Bus(200); Subway subway1= new
	 * Subway(1); Subway subway2= new Subway(1); Student s1 = new Student("티모",
	 * 100_000); Student s2 = new Student("티모", 100_000);
	 */

	
	String money;
	String number;
	// String

	public void takebus(Bus bus) {
		bus.take(10000);
		money = money + bus;
	}
	
	public void takesubway(Subway subway) {
		subway.take(10000);
		money = money + subway;
	}
	
	public void showInfo() {
		System.out.println("현재 잔액");
	}
	
	//public Student2(String money, String number) {
		
//	}

}
