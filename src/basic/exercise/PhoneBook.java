package basic.exercise;

public class PhoneBook {

	// 속성
	private String name;
	private String number;

	// 기능

	// 생성자
	public PhoneBook(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public void showInfo() {
		System.out.println(">>> 연락처 <<<");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + number);
	}

}// end of class
