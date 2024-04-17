package basic.ch10;

public class BankTest {

	public static void main(String[] args) {

		// 코드의 시작점 
		public static void main(String[] args) {
			
			Bank bank1 = new Bank();
			bank1.name = "우리은행";
			bank1.deposit(10_000); // deposit 리턴타입 --> void --> 값을 받을 수 없음? why?
			int getMoney = bank1.withdraw(10_000); // withdraw 리턴 타입 --> int --> 값을 받을 수 있음  
			System.out.println(">>>>>> 출금 >>>>>>>>>");
			System.out.println("금액 : " + getMoney);

	}

}
