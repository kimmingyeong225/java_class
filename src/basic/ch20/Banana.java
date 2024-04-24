package basic.ch20;

public class Banana extends Fruit {

	String origin;

	public Banana() {
		name = "축식이바나나";
		price = 5000;
		origin = "한국";
	}
	public void SaleBanana() {
		System.out.println("바나나 가격을 할인 합니다");
		price -= 1000;

	
	}
}// end of class
