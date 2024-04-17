package basic.ch10;

public class Bank {
	
	String name;
	int balance;
	
	//입급하다
	public void deposit(int money) {
		balance = balance + money;
		showInfo();
	}
	//출금하다
	public int withdraw(int money) {
		if(balance < money) {
			System.out.println("잘못된 요청입니다.");
			return 0;
		}
		balance = balance - money;
		showInfo();
		return money;
	}
	
	// 현재 은행의 총 잔액을 출력 하다. 
	public void showInfo() {
		System.out.println("현재 잔액은 : " + this.balance + " 입니다.");
		}
	}
	
	

