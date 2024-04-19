package basic.ch12;

public class Employee {
	private int emplyeeId; // 멤버 변수(객체 마다 고유에 값을 가저야 한다)
	private String name;
	private String department;
	
	// 요구 조건
	// 사원이 존재하게 될 때 마다 고유한 사원 번호를
	// 할당하고 싶다. 단 사원 번호는 중복 되어서는 안된다.
	
	// 사원을 지정하고  
	// != 사원이 존재 하진 않을 때마다
	
	
	
	// static 과 멤버 변수에 활용
	// 객체 생성자, 멤버, 함수를 필요하다면 호출 또는 초기화 할 수 있다.
	public Employee(String name) {
		this.name = name;
		this.emplyeeId = Compamy.empSerialNumber;
		Compamy.empSerialNumber++;
		
	}

	public int getEmplyeeId() {
		return emplyeeId;
	}

	public void setEmplyeeId(int emplyeeId) {
		this.emplyeeId = emplyeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
