package basic.ch20;

public class AniamlTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("------------------");

		Animal 주소2 = new Tiger();
		주소2.eating();
		주소2.move();
		System.out.println("------------------");

		Animal 주소3 = new Human();
		주소3.move();
		주소3.eating();

		int n1 = (int) 10.5;
		((Human) 주소3).readBooks();

		System.out.println("----------------");
		
		
	}// end of main

}// end of class
