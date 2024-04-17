package basic.ch08;

public class UserInfo {
	
	public String userId;
	public String userpasword;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	public String userColor;
	
	//생성자 오버로딩이란
	//생성자의 개수가 여러개 있다
	
	//기본 생성자 형태 만들ㅇ ㅓ보기
	public UserInfo() {}
	
	public UserInfo(String id) {
		userId = id;
	}
	
	public UserInfo(String id,String name) {
		userName = name;
		userId = id;
	}
	
	//연습문제
	// 1 - 매개변수 3개를 받는 생성자를 만들어 주세요
	public UserInfo(String id, String name, String number) {
		userId = id;
		userName = name;
		phoneNumber = number;
		
	}
	
	// 2 - 매개변수 4개를 받는 생성자를 만들어 주세요
	public UserInfo(String id, String name, String number, String address) {
		userId = id;
		userName = name;
		phoneNumber = number;
		userAddress = address;
	}
	
	// 3 - 매개변수 5개를 받는 생성자를 만들어 주세요
	public UserInfo(String id, String name, String number, String address, String color) {
		userId = id;
		userName = name;
		phoneNumber = number;
		userAddress = address;
		userColor = color;
	}



}//end of class
