package basic.ch12;

public class Compamy {

	public static String companyName = "그린컴퍼니";
	static int empSerialNumber = 1000;

	// 코드 테스트
	public static void main(String[] args) {
		Employee employee1 = new Employee("홍길동");
		System.out.println(employee1.getEmplyeeId());

		Employee employee2 = new Employee("이순신");
		System.out.println(employee2.getEmplyeeId());

		Employee employee3 = new Employee("강감찬");
		System.out.println(employee3.getEmplyeeId());
}
}